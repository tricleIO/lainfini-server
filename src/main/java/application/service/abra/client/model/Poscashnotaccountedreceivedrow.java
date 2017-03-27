/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Poscashnotaccountedreceivedrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Poscashnotaccountedreceivedrow   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("TAmount")
  private Double tAmount = null;

  @SerializedName("LocalTAmount")
  private Double localTAmount = null;

  @SerializedName("PaymentType_ID")
  private String paymentTypeID = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

   /**
   * Vlastník; ID objektu Neúčtovaný vklad do pokladního místa [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Neúčtovaný vklad do pokladního místa [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Poscashnotaccountedreceivedrow posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Poscashnotaccountedreceivedrow tAmount(Double tAmount) {
    this.tAmount = tAmount;
    return this;
  }

   /**
   * Celkem [persistentní položka]
   * @return tAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem [persistentní položka]")
  public Double getTAmount() {
    return tAmount;
  }

  public void setTAmount(Double tAmount) {
    this.tAmount = tAmount;
  }

  public Poscashnotaccountedreceivedrow localTAmount(Double localTAmount) {
    this.localTAmount = localTAmount;
    return this;
  }

   /**
   * Celkem lokálně [persistentní položka]
   * @return localTAmount
  **/
  @ApiModelProperty(example = "null", value = "Celkem lokálně [persistentní položka]")
  public Double getLocalTAmount() {
    return localTAmount;
  }

  public void setLocalTAmount(Double localTAmount) {
    this.localTAmount = localTAmount;
  }

  public Poscashnotaccountedreceivedrow paymentTypeID(String paymentTypeID) {
    this.paymentTypeID = paymentTypeID;
    return this;
  }

   /**
   * Druh platby; ID objektu Způsob úhrady [persistentní položka]
   * @return paymentTypeID
  **/
  @ApiModelProperty(example = "null", value = "Druh platby; ID objektu Způsob úhrady [persistentní položka]")
  public String getPaymentTypeID() {
    return paymentTypeID;
  }

  public void setPaymentTypeID(String paymentTypeID) {
    this.paymentTypeID = paymentTypeID;
  }

  public Poscashnotaccountedreceivedrow text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text [persistentní položka]
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "Text [persistentní položka]")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Poscashnotaccountedreceivedrow divisionID(String divisionID) {
    this.divisionID = divisionID;
    return this;
  }

   /**
   * Středisko; ID objektu Středisko [persistentní položka]
   * @return divisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko; ID objektu Středisko [persistentní položka]")
  public String getDivisionID() {
    return divisionID;
  }

  public void setDivisionID(String divisionID) {
    this.divisionID = divisionID;
  }

  public Poscashnotaccountedreceivedrow busOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
    return this;
  }

   /**
   * Zakázka; ID objektu Zakázka [persistentní položka]
   * @return busOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka; ID objektu Zakázka [persistentní položka]")
  public String getBusOrderID() {
    return busOrderID;
  }

  public void setBusOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
  }

  public Poscashnotaccountedreceivedrow busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * O.případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "O.případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Poscashnotaccountedreceivedrow busProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
    return this;
  }

   /**
   * Projekt; ID objektu Projekt [persistentní položka]
   * @return busProjectID
  **/
  @ApiModelProperty(example = "null", value = "Projekt; ID objektu Projekt [persistentní položka]")
  public String getBusProjectID() {
    return busProjectID;
  }

  public void setBusProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poscashnotaccountedreceivedrow poscashnotaccountedreceivedrow = (Poscashnotaccountedreceivedrow) o;
    return Objects.equals(this.displayName, poscashnotaccountedreceivedrow.displayName) &&
        Objects.equals(this.ID, poscashnotaccountedreceivedrow.ID) &&
        Objects.equals(this.classID, poscashnotaccountedreceivedrow.classID) &&
        Objects.equals(this.objVersion, poscashnotaccountedreceivedrow.objVersion) &&
        Objects.equals(this.parentID, poscashnotaccountedreceivedrow.parentID) &&
        Objects.equals(this.posIndex, poscashnotaccountedreceivedrow.posIndex) &&
        Objects.equals(this.tAmount, poscashnotaccountedreceivedrow.tAmount) &&
        Objects.equals(this.localTAmount, poscashnotaccountedreceivedrow.localTAmount) &&
        Objects.equals(this.paymentTypeID, poscashnotaccountedreceivedrow.paymentTypeID) &&
        Objects.equals(this.text, poscashnotaccountedreceivedrow.text) &&
        Objects.equals(this.divisionID, poscashnotaccountedreceivedrow.divisionID) &&
        Objects.equals(this.busOrderID, poscashnotaccountedreceivedrow.busOrderID) &&
        Objects.equals(this.busTransactionID, poscashnotaccountedreceivedrow.busTransactionID) &&
        Objects.equals(this.busProjectID, poscashnotaccountedreceivedrow.busProjectID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, tAmount, localTAmount, paymentTypeID, text, divisionID, busOrderID, busTransactionID, busProjectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poscashnotaccountedreceivedrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localTAmount: ").append(toIndentedString(localTAmount)).append("\n");
    sb.append("    paymentTypeID: ").append(toIndentedString(paymentTypeID)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
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

