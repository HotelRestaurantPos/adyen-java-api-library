/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2019 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ThreeDS1Result
 */
public class ThreeDS1Result {
  @SerializedName("cavv")
  private String cavv = null;

  @SerializedName("cavvAlgorithm")
  private String cavvAlgorithm = null;

  @SerializedName("eci")
  private String eci = null;

  @SerializedName("threeDAuthenticatedResponse")
  private String threeDAuthenticatedResponse = null;

  @SerializedName("threeDOfferedResponse")
  private String threeDOfferedResponse = null;

  @SerializedName("xid")
  private String xid = null;

  public ThreeDS1Result cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * The cardholder authentication value (base64 encoded).
   * @return cavv
  **/
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public ThreeDS1Result cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * The CAVV algorithm used.
   * @return cavvAlgorithm
  **/
  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }

  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }

  public ThreeDS1Result eci(String eci) {
    this.eci = eci;
    return this;
  }

   /**
   * 3D Secure Electronic Commerce Indicator (ECI).
   * @return eci
  **/
  public String getEci() {
    return eci;
  }

  public void setEci(String eci) {
    this.eci = eci;
  }

  public ThreeDS1Result threeDAuthenticatedResponse(String threeDAuthenticatedResponse) {
    this.threeDAuthenticatedResponse = threeDAuthenticatedResponse;
    return this;
  }

   /**
   * The authentication response from the ACS.
   * @return threeDAuthenticatedResponse
  **/
  public String getThreeDAuthenticatedResponse() {
    return threeDAuthenticatedResponse;
  }

  public void setThreeDAuthenticatedResponse(String threeDAuthenticatedResponse) {
    this.threeDAuthenticatedResponse = threeDAuthenticatedResponse;
  }

  public ThreeDS1Result threeDOfferedResponse(String threeDOfferedResponse) {
    this.threeDOfferedResponse = threeDOfferedResponse;
    return this;
  }

   /**
   * Whether 3D Secure was offered or not.
   * @return threeDOfferedResponse
  **/
  public String getThreeDOfferedResponse() {
    return threeDOfferedResponse;
  }

  public void setThreeDOfferedResponse(String threeDOfferedResponse) {
    this.threeDOfferedResponse = threeDOfferedResponse;
  }

  public ThreeDS1Result xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * A unique transaction identifier generated by the MPI on behalf of the merchant to identify the 3D Secure transaction, in &#x60;Base64&#x60; encoding.
   * @return xid
  **/
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS1Result threeDS1Result = (ThreeDS1Result) o;
    return Objects.equals(this.cavv, threeDS1Result.cavv) &&
        Objects.equals(this.cavvAlgorithm, threeDS1Result.cavvAlgorithm) &&
        Objects.equals(this.eci, threeDS1Result.eci) &&
        Objects.equals(this.threeDAuthenticatedResponse, threeDS1Result.threeDAuthenticatedResponse) &&
        Objects.equals(this.threeDOfferedResponse, threeDS1Result.threeDOfferedResponse) &&
        Objects.equals(this.xid, threeDS1Result.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, cavvAlgorithm, eci, threeDAuthenticatedResponse, threeDOfferedResponse, xid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS1Result {\n");

    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    threeDAuthenticatedResponse: ").append(toIndentedString(threeDAuthenticatedResponse)).append("\n");
    sb.append("    threeDOfferedResponse: ").append(toIndentedString(threeDOfferedResponse)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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

}
