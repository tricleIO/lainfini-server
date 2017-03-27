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
 * Assetinvlistresult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Assetinvlistresult   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Assetinvlistresultcomp> rows = new ArrayList<Assetinvlistresultcomp>();

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("AssetInv_ID")
  private String assetInvID = null;

  @SerializedName("AssetCard_Type")
  private Integer assetCardType = null;

  @SerializedName("AssetCard_ID")
  private String assetCardID = null;

  @SerializedName("IsCollection")
  private Integer isCollection = null;

  @SerializedName("SmallSubCard_ID")
  private String smallSubCardID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Responsible_ID")
  private String responsibleID = null;

  @SerializedName("AssetLocation_ID")
  private String assetLocationID = null;

  @SerializedName("EvidenceDivision_ID")
  private String evidenceDivisionID = null;

  @SerializedName("ExpensesDivision_ID")
  private String expensesDivisionID = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("AssetCardStatus")
  private Integer assetCardStatus = null;

  @SerializedName("IsImported")
  private Boolean isImported = null;

  @SerializedName("ImportDescription")
  private String importDescription = null;

  @SerializedName("ApprovalStatus")
  private Integer approvalStatus = null;

  @SerializedName("AppliedInCard")
  private Boolean appliedInCard = null;

  @SerializedName("Description")
  private String description = null;

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

  public Assetinvlistresult rows(List<Assetinvlistresultcomp> rows) {
    this.rows = rows;
    return this;
  }

  public Assetinvlistresult addRowsItem(Assetinvlistresultcomp rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Prvek majetku výsledek inventury [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Prvek majetku výsledek inventury [nepersistentní položka]")
  public List<Assetinvlistresultcomp> getRows() {
    return rows;
  }

  public void setRows(List<Assetinvlistresultcomp> rows) {
    this.rows = rows;
  }

  public Assetinvlistresult parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * Odkaz na seznam; ID objektu Inventarizační seznam majetku [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na seznam; ID objektu Inventarizační seznam majetku [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public Assetinvlistresult assetInvID(String assetInvID) {
    this.assetInvID = assetInvID;
    return this;
  }

   /**
   * Odkaz na inventuru; ID objektu Inventura majetku [persistentní položka]
   * @return assetInvID
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na inventuru; ID objektu Inventura majetku [persistentní položka]")
  public String getAssetInvID() {
    return assetInvID;
  }

  public void setAssetInvID(String assetInvID) {
    this.assetInvID = assetInvID;
  }

  public Assetinvlistresult assetCardType(Integer assetCardType) {
    this.assetCardType = assetCardType;
    return this;
  }

   /**
   * Typ majetku [persistentní položka]
   * @return assetCardType
  **/
  @ApiModelProperty(example = "null", value = "Typ majetku [persistentní položka]")
  public Integer getAssetCardType() {
    return assetCardType;
  }

  public void setAssetCardType(Integer assetCardType) {
    this.assetCardType = assetCardType;
  }

  public Assetinvlistresult assetCardID(String assetCardID) {
    this.assetCardID = assetCardID;
    return this;
  }

   /**
   * Odkaz na kartu majetku; ID objektu Karta majetku [persistentní položka]
   * @return assetCardID
  **/
  @ApiModelProperty(example = "null", value = "Odkaz na kartu majetku; ID objektu Karta majetku [persistentní položka]")
  public String getAssetCardID() {
    return assetCardID;
  }

  public void setAssetCardID(String assetCardID) {
    this.assetCardID = assetCardID;
  }

  public Assetinvlistresult isCollection(Integer isCollection) {
    this.isCollection = isCollection;
    return this;
  }

   /**
   * Je kolekce [persistentní položka]
   * @return isCollection
  **/
  @ApiModelProperty(example = "null", value = "Je kolekce [persistentní položka]")
  public Integer getIsCollection() {
    return isCollection;
  }

  public void setIsCollection(Integer isCollection) {
    this.isCollection = isCollection;
  }

  public Assetinvlistresult smallSubCardID(String smallSubCardID) {
    this.smallSubCardID = smallSubCardID;
    return this;
  }

   /**
   * Karta DrM; ID objektu Položka drobného majetku [persistentní položka]
   * @return smallSubCardID
  **/
  @ApiModelProperty(example = "null", value = "Karta DrM; ID objektu Položka drobného majetku [persistentní položka]")
  public String getSmallSubCardID() {
    return smallSubCardID;
  }

  public void setSmallSubCardID(String smallSubCardID) {
    this.smallSubCardID = smallSubCardID;
  }

  public Assetinvlistresult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Assetinvlistresult responsibleID(String responsibleID) {
    this.responsibleID = responsibleID;
    return this;
  }

   /**
   * Odpovědná osoba; ID objektu Odpovědná osoba [persistentní položka]
   * @return responsibleID
  **/
  @ApiModelProperty(example = "null", value = "Odpovědná osoba; ID objektu Odpovědná osoba [persistentní položka]")
  public String getResponsibleID() {
    return responsibleID;
  }

  public void setResponsibleID(String responsibleID) {
    this.responsibleID = responsibleID;
  }

  public Assetinvlistresult assetLocationID(String assetLocationID) {
    this.assetLocationID = assetLocationID;
    return this;
  }

   /**
   * Umístění; ID objektu Umístění majetku [persistentní položka]
   * @return assetLocationID
  **/
  @ApiModelProperty(example = "null", value = "Umístění; ID objektu Umístění majetku [persistentní položka]")
  public String getAssetLocationID() {
    return assetLocationID;
  }

  public void setAssetLocationID(String assetLocationID) {
    this.assetLocationID = assetLocationID;
  }

  public Assetinvlistresult evidenceDivisionID(String evidenceDivisionID) {
    this.evidenceDivisionID = evidenceDivisionID;
    return this;
  }

   /**
   * EvidenceDivision_ID; ID objektu Středisko [persistentní položka]
   * @return evidenceDivisionID
  **/
  @ApiModelProperty(example = "null", value = "EvidenceDivision_ID; ID objektu Středisko [persistentní položka]")
  public String getEvidenceDivisionID() {
    return evidenceDivisionID;
  }

  public void setEvidenceDivisionID(String evidenceDivisionID) {
    this.evidenceDivisionID = evidenceDivisionID;
  }

  public Assetinvlistresult expensesDivisionID(String expensesDivisionID) {
    this.expensesDivisionID = expensesDivisionID;
    return this;
  }

   /**
   * ExpensesDivision_ID; ID objektu Středisko [persistentní položka]
   * @return expensesDivisionID
  **/
  @ApiModelProperty(example = "null", value = "ExpensesDivision_ID; ID objektu Středisko [persistentní položka]")
  public String getExpensesDivisionID() {
    return expensesDivisionID;
  }

  public void setExpensesDivisionID(String expensesDivisionID) {
    this.expensesDivisionID = expensesDivisionID;
  }

  public Assetinvlistresult quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Počet [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Počet [persistentní položka]")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Assetinvlistresult assetCardStatus(Integer assetCardStatus) {
    this.assetCardStatus = assetCardStatus;
    return this;
  }

   /**
   * Stav majetku [persistentní položka]
   * @return assetCardStatus
  **/
  @ApiModelProperty(example = "null", value = "Stav majetku [persistentní položka]")
  public Integer getAssetCardStatus() {
    return assetCardStatus;
  }

  public void setAssetCardStatus(Integer assetCardStatus) {
    this.assetCardStatus = assetCardStatus;
  }

  public Assetinvlistresult isImported(Boolean isImported) {
    this.isImported = isImported;
    return this;
  }

   /**
   * Importován [persistentní položka]
   * @return isImported
  **/
  @ApiModelProperty(example = "null", value = "Importován [persistentní položka]")
  public Boolean getIsImported() {
    return isImported;
  }

  public void setIsImported(Boolean isImported) {
    this.isImported = isImported;
  }

  public Assetinvlistresult importDescription(String importDescription) {
    this.importDescription = importDescription;
    return this;
  }

   /**
   * Poznámka k importu [persistentní položka]
   * @return importDescription
  **/
  @ApiModelProperty(example = "null", value = "Poznámka k importu [persistentní položka]")
  public String getImportDescription() {
    return importDescription;
  }

  public void setImportDescription(String importDescription) {
    this.importDescription = importDescription;
  }

  public Assetinvlistresult approvalStatus(Integer approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Stav schválení [persistentní položka]
   * @return approvalStatus
  **/
  @ApiModelProperty(example = "null", value = "Stav schválení [persistentní položka]")
  public Integer getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(Integer approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public Assetinvlistresult appliedInCard(Boolean appliedInCard) {
    this.appliedInCard = appliedInCard;
    return this;
  }

   /**
   * Změna přenesena [persistentní položka]
   * @return appliedInCard
  **/
  @ApiModelProperty(example = "null", value = "Změna přenesena [persistentní položka]")
  public Boolean getAppliedInCard() {
    return appliedInCard;
  }

  public void setAppliedInCard(Boolean appliedInCard) {
    this.appliedInCard = appliedInCard;
  }

  public Assetinvlistresult description(String description) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetinvlistresult assetinvlistresult = (Assetinvlistresult) o;
    return Objects.equals(this.displayName, assetinvlistresult.displayName) &&
        Objects.equals(this.ID, assetinvlistresult.ID) &&
        Objects.equals(this.classID, assetinvlistresult.classID) &&
        Objects.equals(this.objVersion, assetinvlistresult.objVersion) &&
        Objects.equals(this.rows, assetinvlistresult.rows) &&
        Objects.equals(this.parentID, assetinvlistresult.parentID) &&
        Objects.equals(this.assetInvID, assetinvlistresult.assetInvID) &&
        Objects.equals(this.assetCardType, assetinvlistresult.assetCardType) &&
        Objects.equals(this.assetCardID, assetinvlistresult.assetCardID) &&
        Objects.equals(this.isCollection, assetinvlistresult.isCollection) &&
        Objects.equals(this.smallSubCardID, assetinvlistresult.smallSubCardID) &&
        Objects.equals(this.name, assetinvlistresult.name) &&
        Objects.equals(this.responsibleID, assetinvlistresult.responsibleID) &&
        Objects.equals(this.assetLocationID, assetinvlistresult.assetLocationID) &&
        Objects.equals(this.evidenceDivisionID, assetinvlistresult.evidenceDivisionID) &&
        Objects.equals(this.expensesDivisionID, assetinvlistresult.expensesDivisionID) &&
        Objects.equals(this.quantity, assetinvlistresult.quantity) &&
        Objects.equals(this.assetCardStatus, assetinvlistresult.assetCardStatus) &&
        Objects.equals(this.isImported, assetinvlistresult.isImported) &&
        Objects.equals(this.importDescription, assetinvlistresult.importDescription) &&
        Objects.equals(this.approvalStatus, assetinvlistresult.approvalStatus) &&
        Objects.equals(this.appliedInCard, assetinvlistresult.appliedInCard) &&
        Objects.equals(this.description, assetinvlistresult.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, parentID, assetInvID, assetCardType, assetCardID, isCollection, smallSubCardID, name, responsibleID, assetLocationID, evidenceDivisionID, expensesDivisionID, quantity, assetCardStatus, isImported, importDescription, approvalStatus, appliedInCard, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetinvlistresult {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    assetInvID: ").append(toIndentedString(assetInvID)).append("\n");
    sb.append("    assetCardType: ").append(toIndentedString(assetCardType)).append("\n");
    sb.append("    assetCardID: ").append(toIndentedString(assetCardID)).append("\n");
    sb.append("    isCollection: ").append(toIndentedString(isCollection)).append("\n");
    sb.append("    smallSubCardID: ").append(toIndentedString(smallSubCardID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsibleID: ").append(toIndentedString(responsibleID)).append("\n");
    sb.append("    assetLocationID: ").append(toIndentedString(assetLocationID)).append("\n");
    sb.append("    evidenceDivisionID: ").append(toIndentedString(evidenceDivisionID)).append("\n");
    sb.append("    expensesDivisionID: ").append(toIndentedString(expensesDivisionID)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    assetCardStatus: ").append(toIndentedString(assetCardStatus)).append("\n");
    sb.append("    isImported: ").append(toIndentedString(isImported)).append("\n");
    sb.append("    importDescription: ").append(toIndentedString(importDescription)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    appliedInCard: ").append(toIndentedString(appliedInCard)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

