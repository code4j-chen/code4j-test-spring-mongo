package in.code4j.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {

  @Id
  private ObjectId id;
  private Float total;

}

