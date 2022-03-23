
package main.java.com.bloomshoppingcomplex.DynamoDB;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.List;

@DynamoDBTable(tableName = "items")
public class ItemTable {

    private String itemId;
    private String storeName;
    private String name;
    private int quantity;


    @DynamoDBHashKey(attributeName = "itemId")
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    @DynamoDBRangeKey(attributeName = "storeName")
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @DynamoDBAttribute(attributeName = "quantity")
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


