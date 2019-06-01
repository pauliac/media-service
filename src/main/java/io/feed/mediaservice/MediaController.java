package io.feed.mediaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.feed.data.Media;
import io.feed.data.MediaRepo;
import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class MediaController {

    @Autowired
    MediaRepo repo;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/media")
    public ResponseEntity<Media[]> getMedia() {
        Media m1 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/022b01cc85d344629d999be3bafd6498/5CEEBC15/t51.2885-15/e35/60580450_2319084704998517_8360120739215865942_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        // m1.add(new Link("http://localhost:8080/media/1", "modify"));

        Media m2 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/7a731612d1c1c2b246866978e2cd01cf/5D919E8D/t51.2885-15/e35/61265669_197509414550389_6363971189852084788_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        Media m3 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/f42b5701b2af98ed018a15603ba4826f/5D96E58B/t51.2885-15/sh0.08/e35/p640x640/61531538_389570495100298_385652030434128759_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        Media m4 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/60ff97e1f5cc0b6be360a08e60fdfd78/5D7C1F8D/t51.2885-15/sh0.08/e35/p640x640/61332931_862134937473023_180428966678681783_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        Media m5 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/9cc338b643fa6476fcc6b0c84d7aeecf/5D7A9263/t51.2885-15/sh0.08/e35/p640x640/60272359_820413548329258_8205632668813584414_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        // m5.add(new Link("http://localhost:8080/media/5", "modify"));
        Media m6 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/708c1e96f54d883728fe05843b099642/5D94E865/t51.2885-15/sh0.08/e35/p640x640/60402093_447608459145454_1242612566496742308_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");

        Media m7 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/07bd7c21d90351aae832b2be8b444826/5D862E96/t51.2885-15/sh0.08/e35/p640x640/60497608_336150907046226_3133722406021790334_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");

        Media m8 = new Media(
                "https://scontent-dfw5-1.cdninstagram.com/vp/c4ba4a91fe20818c1e69cb822d6e7b80/5D9FB52F/t51.2885-15/sh0.08/e35/p640x640/60201064_168289910863653_9048234796051313594_n.jpg?_nc_ht=scontent-dfw5-1.cdninstagram.com");
        return ResponseEntity.ok().body(new Media[] { m1, m2, m3, m4, m5, m6, m7, m8 });
    }

    @PostMapping("/media")
    public ResponseEntity postMedia(@RequestBody Media media) {
        repo.save(media);
        return ResponseEntity.ok().build();
    }

}
