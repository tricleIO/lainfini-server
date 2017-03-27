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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Internaldocumentrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Internaldocumentrow   {
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

  @SerializedName("CDConfirmedRows")
  private List<Cdconfirmlink> cDConfirmedRows = new ArrayList<Cdconfirmlink>();

  @SerializedName("CDConfirmedAmount")
  private Double cDConfirmedAmount = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("DebitAccount_ID")
  private String debitAccountID = null;

  @SerializedName("DebitDivision_ID")
  private String debitDivisionID = null;

  @SerializedName("DebitBusOrder_ID")
  private String debitBusOrderID = null;

  @SerializedName("DebitBusTransaction_ID")
  private String debitBusTransactionID = null;

  @SerializedName("DebitBusProject_ID")
  private String debitBusProjectID = null;

  @SerializedName("CreditAccount_ID")
  private String creditAccountID = null;

  @SerializedName("CreditDivision_ID")
  private String creditDivisionID = null;

  @SerializedName("CreditBusOrder_ID")
  private String creditBusOrderID = null;

  @SerializedName("CreditBusTransaction_ID")
  private String creditBusTransactionID = null;

  @SerializedName("CreditBusProject_ID")
  private String creditBusProjectID = null;

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
   * Vlastník; ID objektu Interní doklad [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Interní doklad [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Internaldocumentrow posIndex(Integer posIndex) {
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

  public Internaldocumentrow tAmount(Double tAmount) {
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

  public Internaldocumentrow localTAmount(Double localTAmount) {
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

  public Internaldocumentrow cDConfirmedRows(List<Cdconfirmlink> cDConfirmedRows) {
    this.cDConfirmedRows = cDConfirmedRows;
    return this;
  }

  public Internaldocumentrow addCDConfirmedRowsItem(Cdconfirmlink cDConfirmedRowsItem) {
    this.cDConfirmedRows.add(cDConfirmedRowsItem);
    return this;
  }

   /**
   * Odkaz na importovaný řádek schváleného výdaje; kolekce BO Vazba mezi schváleným výdajem a dokladem [nepersistentní položka]
   * @return cDConfirmedRows
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na importovaný řádek schváleného výdaje; kolekce BO Vazba mezi schváleným výdajem a dokladem [nepersistentní položka]")
  public List<Cdconfirmlink> getCDConfirmedRows() {
    return cDConfirmedRows;
  }

  public void setCDConfirmedRows(List<Cdconfirmlink> cDConfirmedRows) {
    this.cDConfirmedRows = cDConfirmedRows;
  }

  public Internaldocumentrow cDConfirmedAmount(Double cDConfirmedAmount) {
    this.cDConfirmedAmount = cDConfirmedAmount;
    return this;
  }

   /**
   * Částka pokrytá schválenými výdaji
   * @return cDConfirmedAmount
  **/
  @ApiModelProperty(example = "null", value = "Částka pokrytá schválenými výdaji")
  public Double getCDConfirmedAmount() {
    return cDConfirmedAmount;
  }

  public void setCDConfirmedAmount(Double cDConfirmedAmount) {
    this.cDConfirmedAmount = cDConfirmedAmount;
  }

  public Internaldocumentrow text(String text) {
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

  public Internaldocumentrow debitAccountID(String debitAccountID) {
    this.debitAccountID = debitAccountID;
    return this;
  }

   /**
   * Účet MD; ID objektu Účet účetního rozvrhu [persistentní položka]
   * @return debitAccountID
  **/
  @ApiModelProperty(example = "null", value = "Účet MD; ID objektu Účet účetního rozvrhu [persistentní položka]")
  public String getDebitAccountID() {
    return debitAccountID;
  }

  public void setDebitAccountID(String debitAccountID) {
    this.debitAccountID = debitAccountID;
  }

  public Internaldocumentrow debitDivisionID(String debitDivisionID) {
    this.debitDivisionID = debitDivisionID;
    return this;
  }

   /**
   * Středisko MD; ID objektu Středisko [persistentní položka]
   * @return debitDivisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko MD; ID objektu Středisko [persistentní položka]")
  public String getDebitDivisionID() {
    return debitDivisionID;
  }

  public void setDebitDivisionID(String debitDivisionID) {
    this.debitDivisionID = debitDivisionID;
  }

  public Internaldocumentrow debitBusOrderID(String debitBusOrderID) {
    this.debitBusOrderID = debitBusOrderID;
    return this;
  }

   /**
   * Zakázka MD; ID objektu Zakázka [persistentní položka]
   * @return debitBusOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka MD; ID objektu Zakázka [persistentní položka]")
  public String getDebitBusOrderID() {
    return debitBusOrderID;
  }

  public void setDebitBusOrderID(String debitBusOrderID) {
    this.debitBusOrderID = debitBusOrderID;
  }

  public Internaldocumentrow debitBusTransactionID(String debitBusTransactionID) {
    this.debitBusTransactionID = debitBusTransactionID;
    return this;
  }

   /**
   * O.případ MD; ID objektu Obchodní případ [persistentní položka]
   * @return debitBusTransactionID
  **/
  @ApiModelProperty(example = "null", value = "O.případ MD; ID objektu Obchodní případ [persistentní položka]")
  public String getDebitBusTransactionID() {
    return debitBusTransactionID;
  }

  public void setDebitBusTransactionID(String debitBusTransactionID) {
    this.debitBusTransactionID = debitBusTransactionID;
  }

  public Internaldocumentrow debitBusProjectID(String debitBusProjectID) {
    this.debitBusProjectID = debitBusProjectID;
    return this;
  }

   /**
   * Projekt MD; ID objektu Projekt [persistentní položka]
   * @return debitBusProjectID
  **/
  @ApiModelProperty(example = "null", value = "Projekt MD; ID objektu Projekt [persistentní položka]")
  public String getDebitBusProjectID() {
    return debitBusProjectID;
  }

  public void setDebitBusProjectID(String debitBusProjectID) {
    this.debitBusProjectID = debitBusProjectID;
  }

  public Internaldocumentrow creditAccountID(String creditAccountID) {
    this.creditAccountID = creditAccountID;
    return this;
  }

   /**
   * Účet D; ID objektu Účet účetního rozvrhu [persistentní položka]
   * @return creditAccountID
  **/
  @ApiModelProperty(example = "null", value = "Účet D; ID objektu Účet účetního rozvrhu [persistentní položka]")
  public String getCreditAccountID() {
    return creditAccountID;
  }

  public void setCreditAccountID(String creditAccountID) {
    this.creditAccountID = creditAccountID;
  }

  public Internaldocumentrow creditDivisionID(String creditDivisionID) {
    this.creditDivisionID = creditDivisionID;
    return this;
  }

   /**
   * Středisko D; ID objektu Středisko [persistentní položka]
   * @return creditDivisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko D; ID objektu Středisko [persistentní položka]")
  public String getCreditDivisionID() {
    return creditDivisionID;
  }

  public void setCreditDivisionID(String creditDivisionID) {
    this.creditDivisionID = creditDivisionID;
  }

  public Internaldocumentrow creditBusOrderID(String creditBusOrderID) {
    this.creditBusOrderID = creditBusOrderID;
    return this;
  }

   /**
   * Zakázka D; ID objektu Zakázka [persistentní položka]
   * @return creditBusOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka D; ID objektu Zakázka [persistentní položka]")
  public String getCreditBusOrderID() {
    return creditBusOrderID;
  }

  public void setCreditBusOrderID(String creditBusOrderID) {
    this.creditBusOrderID = creditBusOrderID;
  }

  public Internaldocumentrow creditBusTransactionID(String creditBusTransactionID) {
    this.creditBusTransactionID = creditBusTransactionID;
    return this;
  }

   /**
   * O.případ D; ID objektu Obchodní případ [persistentní položka]
   * @return creditBusTransactionID
  **/
  @ApiModelProperty(example = "null", value = "O.případ D; ID objektu Obchodní případ [persistentní položka]")
  public String getCreditBusTransactionID() {
    return creditBusTransactionID;
  }

  public void setCreditBusTransactionID(String creditBusTransactionID) {
    this.creditBusTransactionID = creditBusTransactionID;
  }

  public Internaldocumentrow creditBusProjectID(String creditBusProjectID) {
    this.creditBusProjectID = creditBusProjectID;
    return this;
  }

   /**
   * Projekt D; ID objektu Projekt [persistentní položka]
   * @return creditBusProjectID
  **/
  @ApiModelProperty(example = "null", value = "Projekt D; ID objektu Projekt [persistentní položka]")
  public String getCreditBusProjectID() {
    return creditBusProjectID;
  }

  public void setCreditBusProjectID(String creditBusProjectID) {
    this.creditBusProjectID = creditBusProjectID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Internaldocumentrow internaldocumentrow = (Internaldocumentrow) o;
    return Objects.equals(this.displayName, internaldocumentrow.displayName) &&
        Objects.equals(this.ID, internaldocumentrow.ID) &&
        Objects.equals(this.classID, internaldocumentrow.classID) &&
        Objects.equals(this.objVersion, internaldocumentrow.objVersion) &&
        Objects.equals(this.parentID, internaldocumentrow.parentID) &&
        Objects.equals(this.posIndex, internaldocumentrow.posIndex) &&
        Objects.equals(this.tAmount, internaldocumentrow.tAmount) &&
        Objects.equals(this.localTAmount, internaldocumentrow.localTAmount) &&
        Objects.equals(this.cDConfirmedRows, internaldocumentrow.cDConfirmedRows) &&
        Objects.equals(this.cDConfirmedAmount, internaldocumentrow.cDConfirmedAmount) &&
        Objects.equals(this.text, internaldocumentrow.text) &&
        Objects.equals(this.debitAccountID, internaldocumentrow.debitAccountID) &&
        Objects.equals(this.debitDivisionID, internaldocumentrow.debitDivisionID) &&
        Objects.equals(this.debitBusOrderID, internaldocumentrow.debitBusOrderID) &&
        Objects.equals(this.debitBusTransactionID, internaldocumentrow.debitBusTransactionID) &&
        Objects.equals(this.debitBusProjectID, internaldocumentrow.debitBusProjectID) &&
        Objects.equals(this.creditAccountID, internaldocumentrow.creditAccountID) &&
        Objects.equals(this.creditDivisionID, internaldocumentrow.creditDivisionID) &&
        Objects.equals(this.creditBusOrderID, internaldocumentrow.creditBusOrderID) &&
        Objects.equals(this.creditBusTransactionID, internaldocumentrow.creditBusTransactionID) &&
        Objects.equals(this.creditBusProjectID, internaldocumentrow.creditBusProjectID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, tAmount, localTAmount, cDConfirmedRows, cDConfirmedAmount, text, debitAccountID, debitDivisionID, debitBusOrderID, debitBusTransactionID, debitBusProjectID, creditAccountID, creditDivisionID, creditBusOrderID, creditBusTransactionID, creditBusProjectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Internaldocumentrow {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    tAmount: ").append(toIndentedString(tAmount)).append("\n");
    sb.append("    localTAmount: ").append(toIndentedString(localTAmount)).append("\n");
    sb.append("    cDConfirmedRows: ").append(toIndentedString(cDConfirmedRows)).append("\n");
    sb.append("    cDConfirmedAmount: ").append(toIndentedString(cDConfirmedAmount)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    debitAccountID: ").append(toIndentedString(debitAccountID)).append("\n");
    sb.append("    debitDivisionID: ").append(toIndentedString(debitDivisionID)).append("\n");
    sb.append("    debitBusOrderID: ").append(toIndentedString(debitBusOrderID)).append("\n");
    sb.append("    debitBusTransactionID: ").append(toIndentedString(debitBusTransactionID)).append("\n");
    sb.append("    debitBusProjectID: ").append(toIndentedString(debitBusProjectID)).append("\n");
    sb.append("    creditAccountID: ").append(toIndentedString(creditAccountID)).append("\n");
    sb.append("    creditDivisionID: ").append(toIndentedString(creditDivisionID)).append("\n");
    sb.append("    creditBusOrderID: ").append(toIndentedString(creditBusOrderID)).append("\n");
    sb.append("    creditBusTransactionID: ").append(toIndentedString(creditBusTransactionID)).append("\n");
    sb.append("    creditBusProjectID: ").append(toIndentedString(creditBusProjectID)).append("\n");
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

