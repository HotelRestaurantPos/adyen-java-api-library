/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.checkout.JSON;

/**
 * StoredPaymentMethod
 */

public class StoredPaymentMethod {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;

  public static final String SERIALIZED_NAME_HOLDER_NAME = "holderName";
  @SerializedName(SERIALIZED_NAME_HOLDER_NAME)
  private String holderName;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_FOUR = "lastFour";
  @SerializedName(SERIALIZED_NAME_LAST_FOUR)
  private String lastFour;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK_TX_REFERENCE = "networkTxReference";
  @SerializedName(SERIALIZED_NAME_NETWORK_TX_REFERENCE)
  private String networkTxReference;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  public static final String SERIALIZED_NAME_SUPPORTED_SHOPPER_INTERACTIONS = "supportedShopperInteractions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_SHOPPER_INTERACTIONS)
  private List<String> supportedShopperInteractions = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public StoredPaymentMethod() { 
  }

  public StoredPaymentMethod brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the card.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The brand of the card.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public StoredPaymentMethod expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month the card expires.
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month the card expires.")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public StoredPaymentMethod expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The last two digits of the year the card expires. For example, **22** for the year 2022.
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last two digits of the year the card expires. For example, **22** for the year 2022.")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public StoredPaymentMethod holderName(String holderName) {
    
    this.holderName = holderName;
    return this;
  }

   /**
   * The unique payment method code.
   * @return holderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique payment method code.")

  public String getHolderName() {
    return holderName;
  }


  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public StoredPaymentMethod iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The IBAN of the bank account.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IBAN of the bank account.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public StoredPaymentMethod id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of this stored payment method.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier of this stored payment method.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StoredPaymentMethod lastFour(String lastFour) {
    
    this.lastFour = lastFour;
    return this;
  }

   /**
   * The last four digits of the PAN.
   * @return lastFour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last four digits of the PAN.")

  public String getLastFour() {
    return lastFour;
  }


  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


  public StoredPaymentMethod name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The display name of the stored payment method.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the stored payment method.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StoredPaymentMethod networkTxReference(String networkTxReference) {
    
    this.networkTxReference = networkTxReference;
    return this;
  }

   /**
   * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
   * @return networkTxReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.")

  public String getNetworkTxReference() {
    return networkTxReference;
  }


  public void setNetworkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
  }


  public StoredPaymentMethod ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder.
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the bank account holder.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public StoredPaymentMethod shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper’s email address.
   * @return shopperEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper’s email address.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public StoredPaymentMethod supportedShopperInteractions(List<String> supportedShopperInteractions) {
    
    this.supportedShopperInteractions = supportedShopperInteractions;
    return this;
  }

  public StoredPaymentMethod addSupportedShopperInteractionsItem(String supportedShopperInteractionsItem) {
    if (this.supportedShopperInteractions == null) {
      this.supportedShopperInteractions = new ArrayList<>();
    }
    this.supportedShopperInteractions.add(supportedShopperInteractionsItem);
    return this;
  }

   /**
   * The supported shopper interactions for this stored payment method.
   * @return supportedShopperInteractions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The supported shopper interactions for this stored payment method.")

  public List<String> getSupportedShopperInteractions() {
    return supportedShopperInteractions;
  }


  public void setSupportedShopperInteractions(List<String> supportedShopperInteractions) {
    this.supportedShopperInteractions = supportedShopperInteractions;
  }


  public StoredPaymentMethod type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of payment method.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of payment method.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredPaymentMethod storedPaymentMethod = (StoredPaymentMethod) o;
    return Objects.equals(this.brand, storedPaymentMethod.brand) &&
        Objects.equals(this.expiryMonth, storedPaymentMethod.expiryMonth) &&
        Objects.equals(this.expiryYear, storedPaymentMethod.expiryYear) &&
        Objects.equals(this.holderName, storedPaymentMethod.holderName) &&
        Objects.equals(this.iban, storedPaymentMethod.iban) &&
        Objects.equals(this.id, storedPaymentMethod.id) &&
        Objects.equals(this.lastFour, storedPaymentMethod.lastFour) &&
        Objects.equals(this.name, storedPaymentMethod.name) &&
        Objects.equals(this.networkTxReference, storedPaymentMethod.networkTxReference) &&
        Objects.equals(this.ownerName, storedPaymentMethod.ownerName) &&
        Objects.equals(this.shopperEmail, storedPaymentMethod.shopperEmail) &&
        Objects.equals(this.supportedShopperInteractions, storedPaymentMethod.supportedShopperInteractions) &&
        Objects.equals(this.type, storedPaymentMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, expiryMonth, expiryYear, holderName, iban, id, lastFour, name, networkTxReference, ownerName, shopperEmail, supportedShopperInteractions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredPaymentMethod {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkTxReference: ").append(toIndentedString(networkTxReference)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    supportedShopperInteractions: ").append(toIndentedString(supportedShopperInteractions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("brand");
    openapiFields.add("expiryMonth");
    openapiFields.add("expiryYear");
    openapiFields.add("holderName");
    openapiFields.add("iban");
    openapiFields.add("id");
    openapiFields.add("lastFour");
    openapiFields.add("name");
    openapiFields.add("networkTxReference");
    openapiFields.add("ownerName");
    openapiFields.add("shopperEmail");
    openapiFields.add("supportedShopperInteractions");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoredPaymentMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoredPaymentMethod.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoredPaymentMethod is not found in the empty JSON string", StoredPaymentMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoredPaymentMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoredPaymentMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // validate the optional field expiryMonth
      if (jsonObj.get("expiryMonth") != null && !jsonObj.get("expiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryMonth").toString()));
      }
      // validate the optional field expiryYear
      if (jsonObj.get("expiryYear") != null && !jsonObj.get("expiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryYear").toString()));
      }
      // validate the optional field holderName
      if (jsonObj.get("holderName") != null && !jsonObj.get("holderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderName").toString()));
      }
      // validate the optional field iban
      if (jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field lastFour
      if (jsonObj.get("lastFour") != null && !jsonObj.get("lastFour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastFour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastFour").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field networkTxReference
      if (jsonObj.get("networkTxReference") != null && !jsonObj.get("networkTxReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkTxReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkTxReference").toString()));
      }
      // validate the optional field ownerName
      if (jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("supportedShopperInteractions") != null && !jsonObj.get("supportedShopperInteractions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedShopperInteractions` to be an array in the JSON string but got `%s`", jsonObj.get("supportedShopperInteractions").toString()));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoredPaymentMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoredPaymentMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoredPaymentMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoredPaymentMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<StoredPaymentMethod>() {
           @Override
           public void write(JsonWriter out, StoredPaymentMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoredPaymentMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoredPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoredPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to StoredPaymentMethod
  */
  public static StoredPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoredPaymentMethod.class);
  }

 /**
  * Convert an instance of StoredPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

