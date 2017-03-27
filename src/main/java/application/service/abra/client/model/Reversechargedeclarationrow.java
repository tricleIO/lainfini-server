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
 * Reversechargedeclarationrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Reversechargedeclarationrow   {
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

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("VATRate")
  private Double vATRate = null;

  @SerializedName("VATIndex_ID")
  private String vATIndexID = null;

  @SerializedName("LocalVATAmount")
  private Double localVATAmount = null;

  @SerializedName("LocalBaseAmount")
  private Double localBaseAmount = null;

  @SerializedName("VATRate_ID")
  private String vATRateID = null;

  @SerializedName("VATAmount")
  private Double vATAmount = null;

  @SerializedName("BaseAmount")
  private Double baseAmount = null;

  @SerializedName("SourceAmount")
  private Double sourceAmount = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("DRCArticle_ID")
  private String dRCArticleID = null;

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
   * Vlastník; ID objektu Doklad reverse charge [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Doklad reverse charge [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Reversechargedeclarationrow posIndex(Integer posIndex) {
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

  public Reversechargedeclarationrow text(String text) {
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

  public Reversechargedeclarationrow divisionID(String divisionID) {
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

  public Reversechargedeclarationrow busOrderID(String busOrderID) {
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

  public Reversechargedeclarationrow busTransactionID(String busTransactionID) {
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

   /**
   * DPH sazba [persistentní položka]
   * @return vATRate
  **/
  @ApiModelProperty(example = "null", value = "DPH sazba [persistentní položka]")
  public Double getVATRate() {
    return vATRate;
  }

  public Reversechargedeclarationrow vATIndexID(String vATIndexID) {
    this.vATIndexID = vATIndexID;
    return this;
  }

   /**
   * DPH Index; ID objektu DPH index [persistentní položka]
   * @return vATIndexID
  **/
  @ApiModelProperty(example = "null", value = "DPH Index; ID objektu DPH index [persistentní položka]")
  public String getVATIndexID() {
    return vATIndexID;
  }

  public void setVATIndexID(String vATIndexID) {
    this.vATIndexID = vATIndexID;
  }

   /**
   * Odvod DPH v lok.měně [persistentní položka]
   * @return localVATAmount
  **/
  @ApiModelProperty(example = "null", value = "Odvod DPH v lok.měně [persistentní položka]")
  public Double getLocalVATAmount() {
    return localVATAmount;
  }

   /**
   * Základ přepočítaný v lokální měně [persistentní položka]
   * @return localBaseAmount
  **/
  @ApiModelProperty(example = "null", value = "Základ přepočítaný v lokální měně [persistentní položka]")
  public Double getLocalBaseAmount() {
    return localBaseAmount;
  }

  public Reversechargedeclarationrow vATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
    return this;
  }

   /**
   * %DPH; ID objektu DPH sazba [persistentní položka]
   * @return vATRateID
  **/
  @ApiModelProperty(example = "null", value = "%DPH; ID objektu DPH sazba [persistentní položka]")
  public String getVATRateID() {
    return vATRateID;
  }

  public void setVATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
  }

  public Reversechargedeclarationrow vATAmount(Double vATAmount) {
    this.vATAmount = vATAmount;
    return this;
  }

   /**
   * Odvod DPH [persistentní položka]
   * @return vATAmount
  **/
  @ApiModelProperty(example = "null", value = "Odvod DPH [persistentní položka]")
  public Double getVATAmount() {
    return vATAmount;
  }

  public void setVATAmount(Double vATAmount) {
    this.vATAmount = vATAmount;
  }

  public Reversechargedeclarationrow baseAmount(Double baseAmount) {
    this.baseAmount = baseAmount;
    return this;
  }

   /**
   * Základ přepočítaný [persistentní položka]
   * @return baseAmount
  **/
  @ApiModelProperty(example = "null", value = "Základ přepočítaný [persistentní položka]")
  public Double getBaseAmount() {
    return baseAmount;
  }

  public void setBaseAmount(Double baseAmount) {
    this.baseAmount = baseAmount;
  }

  public Reversechargedeclarationrow sourceAmount(Double sourceAmount) {
    this.sourceAmount = sourceAmount;
    return this;
  }

   /**
   * Základ [persistentní položka]
   * @return sourceAmount
  **/
  @ApiModelProperty(example = "null", value = "Základ [persistentní položka]")
  public Double getSourceAmount() {
    return sourceAmount;
  }

  public void setSourceAmount(Double sourceAmount) {
    this.sourceAmount = sourceAmount;
  }

  public Reversechargedeclarationrow busProjectID(String busProjectID) {
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

  public Reversechargedeclarationrow dRCArticleID(String dRCArticleID) {
    this.dRCArticleID = dRCArticleID;
    return this;
  }

   /**
   * Typ plnění; ID objektu Kód typu plnění [persistentní položka]
   * @return dRCArticleID
  **/
  @ApiModelProperty(example = "null", value = "Typ plnění; ID objektu Kód typu plnění [persistentní položka]")
  public String getDRCArticleID() {
    return dRCArticleID;
  }

  public void setDRCArticleID(String dRCArticleID) {
    this.dRCArticleID = dRCArticleID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reversechargedeclarationrow reversechargedeclarationrow = (Reversechargedeclarationrow) o;
    return Objects.equals(this.displayName, reversechargedeclarationrow.displayName) &&
        Objects.equals(this.ID, reversechargedeclarationrow.ID) &&
        Objects.equals(this.classID, reversechargedeclarationrow.classID) &&
        Objects.equals(this.objVersion, reversechargedeclarationrow.objVersion) &&
        Objects.equals(this.parentID, reversechargedeclarationrow.parentID) &&
        Objects.equals(this.posIndex, reversechargedeclarationrow.posIndex) &&
        Objects.equals(this.text, reversechargedeclarationrow.text) &&
        Objects.equals(this.divisionID, reversechargedeclarationrow.divisionID) &&
        Objects.equals(this.busOrderID, reversechargedeclarationrow.busOrderID) &&
        Objects.equals(this.busTransactionID, reversechargedeclarationrow.busTransactionID) &&
        Objects.equals(this.vATRate, reversechargedeclarationrow.vATRate) &&
        Objects.equals(this.vATIndexID, reversechargedeclarationrow.vATIndexID) &&
        Objects.equals(this.localVATAmount, reversechargedeclarationrow.localVATAmount) &&
        Objects.equals(this.localBaseAmount, reversechargedeclarationrow.localBaseAmount) &&
        Objects.equals(this.vATRateID, reversechargedeclarationrow.vATRateID) &&
        Objects.equals(this.vATAmount, reversechargedeclarationrow.vATAmount) &&
        Objects.equals(this.baseAmount, reversechargedeclarationrow.baseAmount) &&
        Objects.equals(this.sourceAmount, reversechargedeclarationrow.sourceAmount) &&
        Objects.equals(this.busProjectID, reversechargedeclarationrow.busProjectID) &&
        Objects.equals(this.dRCArticleID, reversechargedeclarationrow.dRCArticleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, text, divisionID, busOrderID, busTransactionID, vATRate, vATIndexID, localVATAmount, localBaseAmount, vATRateID, vATAmount, baseAmount, sourceAmount, busProjectID, dRCArticleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reversechargedeclarationrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    vATRate: ").append(toIndentedString(vATRate)).append("\n");
    sb.append("    vATIndexID: ").append(toIndentedString(vATIndexID)).append("\n");
    sb.append("    localVATAmount: ").append(toIndentedString(localVATAmount)).append("\n");
    sb.append("    localBaseAmount: ").append(toIndentedString(localBaseAmount)).append("\n");
    sb.append("    vATRateID: ").append(toIndentedString(vATRateID)).append("\n");
    sb.append("    vATAmount: ").append(toIndentedString(vATAmount)).append("\n");
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    dRCArticleID: ").append(toIndentedString(dRCArticleID)).append("\n");
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

