package com.digitalinnovation.api.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class HeroesData {
  private static final String ENDPOINT_DYNAMO = "http://localhost:8000" ;
  private static final String REGION_DYNAMO = "us-east-1";

  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Api_Table");

    Item hero = new Item()
      .withPrimaryKey("id", "2")
      .withString("name", "Mulher Maravilha")
      .withString("universe", "dc comics")
      .withNumber("films", 2);

    Item hero2 = new Item()
      .withPrimaryKey("id", "3")
      .withString("name", "Viuva negra")
      .withString("universe", "marvel")
      .withNumber("films", 2);

    Item hero3 = new Item()
      .withPrimaryKey("id", "4")
      .withString("name", "Capita marvel")
      .withString("universe", "marvel")
      .withNumber("films", 2);

    Item hero4 = new Item()
      .withPrimaryKey("id", "5")
      .withString("name", "Capita Vacina")
      .withString("universe", "bRASIL")
      .withNumber("films", 2);

    Item hero5 = new Item()
      .withPrimaryKey("id", "6")
      .withString("name", "Capitao COVID")
      .withString("universe", "anime")
      .withNumber("films", 2);

    PutItemOutcome outcome1 = table.putItem(hero);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);
    PutItemOutcome outcome4 = table.putItem(hero4);
    PutItemOutcome outcome5 = table.putItem(hero5);

  }

}

