package com.eCommerce.jewelrystore.aws.s3.api;

import com.eCommerce.jewelrystore.aws.s3.util.AmazonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/aws/storage")
public class ImageController {

//    @Autowired
//    private AmazonS3 amazonS3Client;
//
//    @PostMapping("/uploadFile")
//    public ResponseEntity<HttpStatus> uploadFile(@RequestPart(value = "file") MultipartFile file) {
//        File files = new File("FileName");
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(files);
//            fileOutputStream.write(file.getBytes());
//        } catch (IOException e) {
//            /* Handle Exception */
//        }
//        PutObjectResult result = this.amazonS3Client.putObject(new PutObjectRequest("bucketunamu", "fileKey", files));
//        return ResponseEntity.ok().build();
//    }
//
//    @DeleteMapping("/deleteFile")
//    public ResponseEntity<HttpStatus> deleteFile(@RequestPart(value = "url") String fileUrl) {
//         this.amazonS3Client.deleteObject("bucketunamu", "images(1)");
//        return ResponseEntity.ok().build();
//    }
//
//    @GetMapping("/getImage/{filename}")
//    public ResponseEntity<byte[]> getImage(@PathVariable(name="filename") String filename) {
//        S3Object s3Object = amazonS3Client.getObject("bucketunamu", "images(1)");
//        S3ObjectInputStream inputStream = s3Object.getObjectContent();
//        byte[] bytes = new byte[0];
//        try {
//            bytes = StreamUtils.copyToByteArray(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String contentType = s3Object.getObjectMetadata().getContentType();
//        return ResponseEntity.ok().contentType(MediaType.valueOf(contentType)).body(bytes);
//    }

    private AmazonClient amazonClient;

    @Autowired
    ImageController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.amazonClient.uploadFile(file);
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }

}
