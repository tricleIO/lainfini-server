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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Assetinv
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Assetinv   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Assetinvlist> rows = new ArrayList<Assetinvlist>();

  @SerializedName("DocQueue_ID")
  private String docQueueID = null;

  @SerializedName("Period_ID")
  private String periodID = null;

  @SerializedName("OrdNumber")
  private Integer ordNumber = null;

  @SerializedName("DocDate$DATE")
  private DateTime docDateDATE = null;

  @SerializedName("CreatedBy_ID")
  private String createdByID = null;

  @SerializedName("CorrectedBy_ID")
  private String correctedByID = null;

  @SerializedName("NewRelatedType")
  private Integer newRelatedType = null;

  @SerializedName("NewRelatedDocument_ID")
  private String newRelatedDocumentID = null;

  @SerializedName("Committee_ID")
  private String committeeID = null;

  @SerializedName("InventoryState")
  private Integer inventoryState = null;

  @SerializedName("InventoryType")
  private Integer inventoryType = null;

  @SerializedName("RestrictionKind")
  private Integer restrictionKind = null;

  @SerializedName("StartDate$DATE")
  private DateTime startDateDATE = null;

  @SerializedName("EndDate$DATE")
  private DateTime endDateDATE = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("InventoryTypeAsText")
  private String inventoryTypeAsText = null;

  @SerializedName("InventoryStateAsText")
  private String inventoryStateAsText = null;

  @SerializedName("RestrictionKindAsText")
  private String restrictionKindAsText = null;

  @SerializedName("CreatedAt$DATE")
  private DateTime createdAtDATE = null;

  @SerializedName("CorrectedAt$DATE")
  private DateTime correctedAtDATE = null;

   /**
   * Číslo dok.
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
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

  public Assetinv rows(List<Assetinvlist> rows) {
    this.rows = rows;
    return this;
  }

  public Assetinv addRowsItem(Assetinvlist rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Inventarizační seznam majetku [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Inventarizační seznam majetku [nepersistentní položka]")
  public List<Assetinvlist> getRows() {
    return rows;
  }

  public void setRows(List<Assetinvlist> rows) {
    this.rows = rows;
  }

  public Assetinv docQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
    return this;
  }

   /**
   * Zdrojová řada; ID objektu Řada dokladů [persistentní položka]
   * @return docQueueID
  **/
  @ApiModelProperty(example = "null", value = "Zdrojová řada; ID objektu Řada dokladů [persistentní položka]")
  public String getDocQueueID() {
    return docQueueID;
  }

  public void setDocQueueID(String docQueueID) {
    this.docQueueID = docQueueID;
  }

  public Assetinv periodID(String periodID) {
    this.periodID = periodID;
    return this;
  }

   /**
   * Období; ID objektu Období [persistentní položka]
   * @return periodID
  **/
  @ApiModelProperty(example = "null", value = "Období; ID objektu Období [persistentní položka]")
  public String getPeriodID() {
    return periodID;
  }

  public void setPeriodID(String periodID) {
    this.periodID = periodID;
  }

  public Assetinv ordNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
    return this;
  }

   /**
   * Pořadové číslo [persistentní položka]
   * @return ordNumber
  **/
  @ApiModelProperty(example = "null", value = "Pořadové číslo [persistentní položka]")
  public Integer getOrdNumber() {
    return ordNumber;
  }

  public void setOrdNumber(Integer ordNumber) {
    this.ordNumber = ordNumber;
  }

  public Assetinv docDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
    return this;
  }

   /**
   * Datum dok. [persistentní položka]
   * @return docDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum dok. [persistentní položka]")
  public DateTime getDocDateDATE() {
    return docDateDATE;
  }

  public void setDocDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
  }

  public Assetinv createdByID(String createdByID) {
    this.createdByID = createdByID;
    return this;
  }

   /**
   * Vytvořil; ID objektu Uživatel [persistentní položka]
   * @return createdByID
  **/
  @ApiModelProperty(example = "null", value = "Vytvořil; ID objektu Uživatel [persistentní položka]")
  public String getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(String createdByID) {
    this.createdByID = createdByID;
  }

  public Assetinv correctedByID(String correctedByID) {
    this.correctedByID = correctedByID;
    return this;
  }

   /**
   * Opravil; ID objektu Uživatel [persistentní položka]
   * @return correctedByID
  **/
  @ApiModelProperty(example = "null", value = "Opravil; ID objektu Uživatel [persistentní položka]")
  public String getCorrectedByID() {
    return correctedByID;
  }

  public void setCorrectedByID(String correctedByID) {
    this.correctedByID = correctedByID;
  }

  public Assetinv newRelatedType(Integer newRelatedType) {
    this.newRelatedType = newRelatedType;
    return this;
  }

   /**
   * Typ relace
   * @return newRelatedType
  **/
  @ApiModelProperty(example = "null", value = "Typ relace")
  public Integer getNewRelatedType() {
    return newRelatedType;
  }

  public void setNewRelatedType(Integer newRelatedType) {
    this.newRelatedType = newRelatedType;
  }

  public Assetinv newRelatedDocumentID(String newRelatedDocumentID) {
    this.newRelatedDocumentID = newRelatedDocumentID;
    return this;
  }

   /**
   * ID dokladu pro připojení
   * @return newRelatedDocumentID
  **/
  @ApiModelProperty(example = "null", value = "ID dokladu pro připojení")
  public String getNewRelatedDocumentID() {
    return newRelatedDocumentID;
  }

  public void setNewRelatedDocumentID(String newRelatedDocumentID) {
    this.newRelatedDocumentID = newRelatedDocumentID;
  }

  public Assetinv committeeID(String committeeID) {
    this.committeeID = committeeID;
    return this;
  }

   /**
   * Ústřední inventarizační komise; ID objektu Inventarizační komise [persistentní položka]
   * @return committeeID
  **/
  @ApiModelProperty(example = "null", value = "Ústřední inventarizační komise; ID objektu Inventarizační komise [persistentní položka]")
  public String getCommitteeID() {
    return committeeID;
  }

  public void setCommitteeID(String committeeID) {
    this.committeeID = committeeID;
  }

  public Assetinv inventoryState(Integer inventoryState) {
    this.inventoryState = inventoryState;
    return this;
  }

   /**
   * Stav inventury [persistentní položka]
   * @return inventoryState
  **/
  @ApiModelProperty(example = "null", value = "Stav inventury [persistentní položka]")
  public Integer getInventoryState() {
    return inventoryState;
  }

  public void setInventoryState(Integer inventoryState) {
    this.inventoryState = inventoryState;
  }

  public Assetinv inventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

   /**
   * Typ inventury [persistentní položka]
   * @return inventoryType
  **/
  @ApiModelProperty(example = "null", value = "Typ inventury [persistentní položka]")
  public Integer getInventoryType() {
    return inventoryType;
  }

  public void setInventoryType(Integer inventoryType) {
    this.inventoryType = inventoryType;
  }

  public Assetinv restrictionKind(Integer restrictionKind) {
    this.restrictionKind = restrictionKind;
    return this;
  }

   /**
   * Podmínka výběru majetku [persistentní položka]
   * @return restrictionKind
  **/
  @ApiModelProperty(example = "null", value = "Podmínka výběru majetku [persistentní položka]")
  public Integer getRestrictionKind() {
    return restrictionKind;
  }

  public void setRestrictionKind(Integer restrictionKind) {
    this.restrictionKind = restrictionKind;
  }

  public Assetinv startDateDATE(DateTime startDateDATE) {
    this.startDateDATE = startDateDATE;
    return this;
  }

   /**
   * Datum zahájení [persistentní položka]
   * @return startDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum zahájení [persistentní položka]")
  public DateTime getStartDateDATE() {
    return startDateDATE;
  }

  public void setStartDateDATE(DateTime startDateDATE) {
    this.startDateDATE = startDateDATE;
  }

  public Assetinv endDateDATE(DateTime endDateDATE) {
    this.endDateDATE = endDateDATE;
    return this;
  }

   /**
   * Datum ukončení [persistentní položka]
   * @return endDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum ukončení [persistentní položka]")
  public DateTime getEndDateDATE() {
    return endDateDATE;
  }

  public void setEndDateDATE(DateTime endDateDATE) {
    this.endDateDATE = endDateDATE;
  }

  public Assetinv description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Assetinv inventoryTypeAsText(String inventoryTypeAsText) {
    this.inventoryTypeAsText = inventoryTypeAsText;
    return this;
  }

   /**
   * Typ inventury
   * @return inventoryTypeAsText
  **/
  @ApiModelProperty(example = "null", value = "Typ inventury")
  public String getInventoryTypeAsText() {
    return inventoryTypeAsText;
  }

  public void setInventoryTypeAsText(String inventoryTypeAsText) {
    this.inventoryTypeAsText = inventoryTypeAsText;
  }

  public Assetinv inventoryStateAsText(String inventoryStateAsText) {
    this.inventoryStateAsText = inventoryStateAsText;
    return this;
  }

   /**
   * Stav inventury
   * @return inventoryStateAsText
  **/
  @ApiModelProperty(example = "null", value = "Stav inventury")
  public String getInventoryStateAsText() {
    return inventoryStateAsText;
  }

  public void setInventoryStateAsText(String inventoryStateAsText) {
    this.inventoryStateAsText = inventoryStateAsText;
  }

  public Assetinv restrictionKindAsText(String restrictionKindAsText) {
    this.restrictionKindAsText = restrictionKindAsText;
    return this;
  }

   /**
   * Podmínka výběru majetku
   * @return restrictionKindAsText
  **/
  @ApiModelProperty(example = "null", value = "Podmínka výběru majetku")
  public String getRestrictionKindAsText() {
    return restrictionKindAsText;
  }

  public void setRestrictionKindAsText(String restrictionKindAsText) {
    this.restrictionKindAsText = restrictionKindAsText;
  }

  public Assetinv createdAtDATE(DateTime createdAtDATE) {
    this.createdAtDATE = createdAtDATE;
    return this;
  }

   /**
   * Vytvořeno [persistentní položka]
   * @return createdAtDATE
  **/
  @ApiModelProperty(example = "null", value = "Vytvořeno [persistentní položka]")
  public DateTime getCreatedAtDATE() {
    return createdAtDATE;
  }

  public void setCreatedAtDATE(DateTime createdAtDATE) {
    this.createdAtDATE = createdAtDATE;
  }

  public Assetinv correctedAtDATE(DateTime correctedAtDATE) {
    this.correctedAtDATE = correctedAtDATE;
    return this;
  }

   /**
   * Opraveno [persistentní položka]
   * @return correctedAtDATE
  **/
  @ApiModelProperty(example = "null", value = "Opraveno [persistentní položka]")
  public DateTime getCorrectedAtDATE() {
    return correctedAtDATE;
  }

  public void setCorrectedAtDATE(DateTime correctedAtDATE) {
    this.correctedAtDATE = correctedAtDATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetinv assetinv = (Assetinv) o;
    return Objects.equals(this.displayName, assetinv.displayName) &&
        Objects.equals(this.ID, assetinv.ID) &&
        Objects.equals(this.classID, assetinv.classID) &&
        Objects.equals(this.objVersion, assetinv.objVersion) &&
        Objects.equals(this.rows, assetinv.rows) &&
        Objects.equals(this.docQueueID, assetinv.docQueueID) &&
        Objects.equals(this.periodID, assetinv.periodID) &&
        Objects.equals(this.ordNumber, assetinv.ordNumber) &&
        Objects.equals(this.docDateDATE, assetinv.docDateDATE) &&
        Objects.equals(this.createdByID, assetinv.createdByID) &&
        Objects.equals(this.correctedByID, assetinv.correctedByID) &&
        Objects.equals(this.newRelatedType, assetinv.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, assetinv.newRelatedDocumentID) &&
        Objects.equals(this.committeeID, assetinv.committeeID) &&
        Objects.equals(this.inventoryState, assetinv.inventoryState) &&
        Objects.equals(this.inventoryType, assetinv.inventoryType) &&
        Objects.equals(this.restrictionKind, assetinv.restrictionKind) &&
        Objects.equals(this.startDateDATE, assetinv.startDateDATE) &&
        Objects.equals(this.endDateDATE, assetinv.endDateDATE) &&
        Objects.equals(this.description, assetinv.description) &&
        Objects.equals(this.inventoryTypeAsText, assetinv.inventoryTypeAsText) &&
        Objects.equals(this.inventoryStateAsText, assetinv.inventoryStateAsText) &&
        Objects.equals(this.restrictionKindAsText, assetinv.restrictionKindAsText) &&
        Objects.equals(this.createdAtDATE, assetinv.createdAtDATE) &&
        Objects.equals(this.correctedAtDATE, assetinv.correctedAtDATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, committeeID, inventoryState, inventoryType, restrictionKind, startDateDATE, endDateDATE, description, inventoryTypeAsText, inventoryStateAsText, restrictionKindAsText, createdAtDATE, correctedAtDATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetinv {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docQueueID: ").append(toIndentedString(docQueueID)).append("\n");
    sb.append("    periodID: ").append(toIndentedString(periodID)).append("\n");
    sb.append("    ordNumber: ").append(toIndentedString(ordNumber)).append("\n");
    sb.append("    docDateDATE: ").append(toIndentedString(docDateDATE)).append("\n");
    sb.append("    createdByID: ").append(toIndentedString(createdByID)).append("\n");
    sb.append("    correctedByID: ").append(toIndentedString(correctedByID)).append("\n");
    sb.append("    newRelatedType: ").append(toIndentedString(newRelatedType)).append("\n");
    sb.append("    newRelatedDocumentID: ").append(toIndentedString(newRelatedDocumentID)).append("\n");
    sb.append("    committeeID: ").append(toIndentedString(committeeID)).append("\n");
    sb.append("    inventoryState: ").append(toIndentedString(inventoryState)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    restrictionKind: ").append(toIndentedString(restrictionKind)).append("\n");
    sb.append("    startDateDATE: ").append(toIndentedString(startDateDATE)).append("\n");
    sb.append("    endDateDATE: ").append(toIndentedString(endDateDATE)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inventoryTypeAsText: ").append(toIndentedString(inventoryTypeAsText)).append("\n");
    sb.append("    inventoryStateAsText: ").append(toIndentedString(inventoryStateAsText)).append("\n");
    sb.append("    restrictionKindAsText: ").append(toIndentedString(restrictionKindAsText)).append("\n");
    sb.append("    createdAtDATE: ").append(toIndentedString(createdAtDATE)).append("\n");
    sb.append("    correctedAtDATE: ").append(toIndentedString(correctedAtDATE)).append("\n");
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

