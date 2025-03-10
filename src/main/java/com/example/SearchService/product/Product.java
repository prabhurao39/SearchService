package com.example.SearchService.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Builder
@Document(collection = "product")
public class Product {
    @Id
    String productId;
    String name;
    String type;
}