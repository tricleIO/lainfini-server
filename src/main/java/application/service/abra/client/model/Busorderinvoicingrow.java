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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Busorderinvoicingrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Busorderinvoicingrow   {
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

  @SerializedName("DocType")
  private String docType = null;

  @SerializedName("Document_ID")
  private String documentID = null;

  @SerializedName("Row_ID")
  private String rowID = null;

  @SerializedName("DocDate$DATE")
  private DateTime docDateDATE = null;

  @SerializedName("DocDispName")
  private String docDispName = null;

  @SerializedName("Quantity")
  private Double quantity = null;

  @SerializedName("Amount")
  private Double amount = null;

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
   * Vlastník; ID objektu Zakázky - vyúčtování fakturace [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Zakázky - vyúčtování fakturace [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Busorderinvoicingrow docType(String docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Typ [persistentní položka]
   * @return docType
  **/
  @ApiModelProperty(example = "null", value = "Typ [persistentní položka]")
  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public Busorderinvoicingrow documentID(String documentID) {
    this.documentID = documentID;
    return this;
  }

   /**
   * Doklad; ID objektu Výstupní doklad [persistentní položka]
   * @return documentID
  **/
  @ApiModelProperty(example = "null", value = "Doklad; ID objektu Výstupní doklad [persistentní položka]")
  public String getDocumentID() {
    return documentID;
  }

  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }

  public Busorderinvoicingrow rowID(String rowID) {
    this.rowID = rowID;
    return this;
  }

   /**
   * Řádek; ID objektu Řádek výstupního dokladu [persistentní položka]
   * @return rowID
  **/
  @ApiModelProperty(example = "null", value = "Řádek; ID objektu Řádek výstupního dokladu [persistentní položka]")
  public String getRowID() {
    return rowID;
  }

  public void setRowID(String rowID) {
    this.rowID = rowID;
  }

  public Busorderinvoicingrow docDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
    return this;
  }

   /**
   * Datum [persistentní položka]
   * @return docDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum [persistentní položka]")
  public DateTime getDocDateDATE() {
    return docDateDATE;
  }

  public void setDocDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
  }

  public Busorderinvoicingrow docDispName(String docDispName) {
    this.docDispName = docDispName;
    return this;
  }

   /**
   * Číslo dokladu [persistentní položka]
   * @return docDispName
  **/
  @ApiModelProperty(example = "null", value = "Číslo dokladu [persistentní položka]")
  public String getDocDispName() {
    return docDispName;
  }

  public void setDocDispName(String docDispName) {
    this.docDispName = docDispName;
  }

  public Busorderinvoicingrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Množství [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Množství [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Busorderinvoicingrow amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busorderinvoicingrow busorderinvoicingrow = (Busorderinvoicingrow) o;
    return Objects.equals(this.displayName, busorderinvoicingrow.displayName) &&
        Objects.equals(this.ID, busorderinvoicingrow.ID) &&
        Objects.equals(this.classID, busorderinvoicingrow.classID) &&
        Objects.equals(this.objVersion, busorderinvoicingrow.objVersion) &&
        Objects.equals(this.parentID, busorderinvoicingrow.parentID) &&
        Objects.equals(this.docType, busorderinvoicingrow.docType) &&
        Objects.equals(this.documentID, busorderinvoicingrow.documentID) &&
        Objects.equals(this.rowID, busorderinvoicingrow.rowID) &&
        Objects.equals(this.docDateDATE, busorderinvoicingrow.docDateDATE) &&
        Objects.equals(this.docDispName, busorderinvoicingrow.docDispName) &&
        Objects.equals(this.quantity, busorderinvoicingrow.quantity) &&
        Objects.equals(this.amount, busorderinvoicingrow.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, docType, documentID, rowID, docDateDATE, docDispName, quantity, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busorderinvoicingrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
    sb.append("    rowID: ").append(toIndentedString(rowID)).append("\n");
    sb.append("    docDateDATE: ").append(toIndentedString(docDateDATE)).append("\n");
    sb.append("    docDispName: ").append(toIndentedString(docDispName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

