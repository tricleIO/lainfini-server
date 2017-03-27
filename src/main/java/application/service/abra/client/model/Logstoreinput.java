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
 * Logstoreinput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Logstoreinput   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Logstoreinputrow> rows = new ArrayList<Logstoreinputrow>();

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

  @SerializedName("DocumentType")
  private String documentType = null;

  @SerializedName("StoreDocumentType")
  private String storeDocumentType = null;

  @SerializedName("StoreDocument_ID")
  private String storeDocumentID = null;

  @SerializedName("StoreGateway_ID")
  private String storeGatewayID = null;

  @SerializedName("Executed")
  private Boolean executed = null;

  @SerializedName("NoStoreDocument")
  private Boolean noStoreDocument = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExternalNumber")
  private String externalNumber = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("StoreMan_ID")
  private String storeManID = null;

  @SerializedName("ReservedForDocType")
  private String reservedForDocType = null;

  @SerializedName("ReservedForDoc_ID")
  private String reservedForDocID = null;

  @SerializedName("MasterDocCLSID")
  private String masterDocCLSID = null;

  @SerializedName("MasterDocument_ID")
  private String masterDocumentID = null;

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

  public Logstoreinput rows(List<Logstoreinputrow> rows) {
    this.rows = rows;
    return this;
  }

  public Logstoreinput addRowsItem(Logstoreinputrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Naskladnění do pozic - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Naskladnění do pozic - řádek [nepersistentní položka]")
  public List<Logstoreinputrow> getRows() {
    return rows;
  }

  public void setRows(List<Logstoreinputrow> rows) {
    this.rows = rows;
  }

  public Logstoreinput docQueueID(String docQueueID) {
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

  public Logstoreinput periodID(String periodID) {
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

  public Logstoreinput ordNumber(Integer ordNumber) {
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

  public Logstoreinput docDateDATE(DateTime docDateDATE) {
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

  public Logstoreinput createdByID(String createdByID) {
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

  public Logstoreinput correctedByID(String correctedByID) {
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

  public Logstoreinput newRelatedType(Integer newRelatedType) {
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

  public Logstoreinput newRelatedDocumentID(String newRelatedDocumentID) {
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

   /**
   * Typ dokladu [persistentní položka]
   * @return documentType
  **/
  @ApiModelProperty(example = "null", value = "Typ dokladu [persistentní položka]")
  public String getDocumentType() {
    return documentType;
  }

  public Logstoreinput storeDocumentType(String storeDocumentType) {
    this.storeDocumentType = storeDocumentType;
    return this;
  }

   /**
   * Typ skl.dokladu [persistentní položka]
   * @return storeDocumentType
  **/
  @ApiModelProperty(example = "null", value = "Typ skl.dokladu [persistentní položka]")
  public String getStoreDocumentType() {
    return storeDocumentType;
  }

  public void setStoreDocumentType(String storeDocumentType) {
    this.storeDocumentType = storeDocumentType;
  }

  public Logstoreinput storeDocumentID(String storeDocumentID) {
    this.storeDocumentID = storeDocumentID;
    return this;
  }

   /**
   * Skl.doklad; ID objektu Dokument [persistentní položka]
   * @return storeDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Skl.doklad; ID objektu Dokument [persistentní položka]")
  public String getStoreDocumentID() {
    return storeDocumentID;
  }

  public void setStoreDocumentID(String storeDocumentID) {
    this.storeDocumentID = storeDocumentID;
  }

  public Logstoreinput storeGatewayID(String storeGatewayID) {
    this.storeGatewayID = storeGatewayID;
    return this;
  }

   /**
   * Místo naskladnění/vyskladnění; ID objektu Nasklad. a vysklad. místo [persistentní položka]
   * @return storeGatewayID
  **/
  @ApiModelProperty(example = "null", value = "Místo naskladnění/vyskladnění; ID objektu Nasklad. a vysklad. místo [persistentní položka]")
  public String getStoreGatewayID() {
    return storeGatewayID;
  }

  public void setStoreGatewayID(String storeGatewayID) {
    this.storeGatewayID = storeGatewayID;
  }

  public Logstoreinput executed(Boolean executed) {
    this.executed = executed;
    return this;
  }

   /**
   * Provedeno [persistentní položka]
   * @return executed
  **/
  @ApiModelProperty(example = "null", value = "Provedeno [persistentní položka]")
  public Boolean getExecuted() {
    return executed;
  }

  public void setExecuted(Boolean executed) {
    this.executed = executed;
  }

  public Logstoreinput noStoreDocument(Boolean noStoreDocument) {
    this.noStoreDocument = noStoreDocument;
    return this;
  }

   /**
   * Jen polohovací [persistentní položka]
   * @return noStoreDocument
  **/
  @ApiModelProperty(example = "null", value = "Jen polohovací [persistentní položka]")
  public Boolean getNoStoreDocument() {
    return noStoreDocument;
  }

  public void setNoStoreDocument(Boolean noStoreDocument) {
    this.noStoreDocument = noStoreDocument;
  }

  public Logstoreinput description(String description) {
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

  public Logstoreinput externalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
    return this;
  }

   /**
   * Externí číslo [persistentní položka]
   * @return externalNumber
  **/
  @ApiModelProperty(example = "null", value = "Externí číslo [persistentní položka]")
  public String getExternalNumber() {
    return externalNumber;
  }

  public void setExternalNumber(String externalNumber) {
    this.externalNumber = externalNumber;
  }

  public Logstoreinput firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Logstoreinput storeManID(String storeManID) {
    this.storeManID = storeManID;
    return this;
  }

   /**
   * Skladník; ID objektu Osoba [persistentní položka]
   * @return storeManID
  **/
  @ApiModelProperty(example = "null", value = "Skladník; ID objektu Osoba [persistentní položka]")
  public String getStoreManID() {
    return storeManID;
  }

  public void setStoreManID(String storeManID) {
    this.storeManID = storeManID;
  }

  public Logstoreinput reservedForDocType(String reservedForDocType) {
    this.reservedForDocType = reservedForDocType;
    return this;
  }

   /**
   * Typ svázaného dokladu [persistentní položka]
   * @return reservedForDocType
  **/
  @ApiModelProperty(example = "null", value = "Typ svázaného dokladu [persistentní položka]")
  public String getReservedForDocType() {
    return reservedForDocType;
  }

  public void setReservedForDocType(String reservedForDocType) {
    this.reservedForDocType = reservedForDocType;
  }

  public Logstoreinput reservedForDocID(String reservedForDocID) {
    this.reservedForDocID = reservedForDocID;
    return this;
  }

   /**
   * Vazba na vychystávaný doklad; ID objektu Dokument [persistentní položka]
   * @return reservedForDocID
  **/
  @ApiModelProperty(example = "null", value = "Vazba na vychystávaný doklad; ID objektu Dokument [persistentní položka]")
  public String getReservedForDocID() {
    return reservedForDocID;
  }

  public void setReservedForDocID(String reservedForDocID) {
    this.reservedForDocID = reservedForDocID;
  }

  public Logstoreinput masterDocCLSID(String masterDocCLSID) {
    this.masterDocCLSID = masterDocCLSID;
    return this;
  }

   /**
   * Třída nadřízeného dokladu [persistentní položka]
   * @return masterDocCLSID
  **/
  @ApiModelProperty(example = "null", value = "Třída nadřízeného dokladu [persistentní položka]")
  public String getMasterDocCLSID() {
    return masterDocCLSID;
  }

  public void setMasterDocCLSID(String masterDocCLSID) {
    this.masterDocCLSID = masterDocCLSID;
  }

  public Logstoreinput masterDocumentID(String masterDocumentID) {
    this.masterDocumentID = masterDocumentID;
    return this;
  }

   /**
   * Nadřízený doklad; ID objektu Dokument [persistentní položka]
   * @return masterDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený doklad; ID objektu Dokument [persistentní položka]")
  public String getMasterDocumentID() {
    return masterDocumentID;
  }

  public void setMasterDocumentID(String masterDocumentID) {
    this.masterDocumentID = masterDocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logstoreinput logstoreinput = (Logstoreinput) o;
    return Objects.equals(this.displayName, logstoreinput.displayName) &&
        Objects.equals(this.ID, logstoreinput.ID) &&
        Objects.equals(this.classID, logstoreinput.classID) &&
        Objects.equals(this.objVersion, logstoreinput.objVersion) &&
        Objects.equals(this.rows, logstoreinput.rows) &&
        Objects.equals(this.docQueueID, logstoreinput.docQueueID) &&
        Objects.equals(this.periodID, logstoreinput.periodID) &&
        Objects.equals(this.ordNumber, logstoreinput.ordNumber) &&
        Objects.equals(this.docDateDATE, logstoreinput.docDateDATE) &&
        Objects.equals(this.createdByID, logstoreinput.createdByID) &&
        Objects.equals(this.correctedByID, logstoreinput.correctedByID) &&
        Objects.equals(this.newRelatedType, logstoreinput.newRelatedType) &&
        Objects.equals(this.newRelatedDocumentID, logstoreinput.newRelatedDocumentID) &&
        Objects.equals(this.documentType, logstoreinput.documentType) &&
        Objects.equals(this.storeDocumentType, logstoreinput.storeDocumentType) &&
        Objects.equals(this.storeDocumentID, logstoreinput.storeDocumentID) &&
        Objects.equals(this.storeGatewayID, logstoreinput.storeGatewayID) &&
        Objects.equals(this.executed, logstoreinput.executed) &&
        Objects.equals(this.noStoreDocument, logstoreinput.noStoreDocument) &&
        Objects.equals(this.description, logstoreinput.description) &&
        Objects.equals(this.externalNumber, logstoreinput.externalNumber) &&
        Objects.equals(this.firmID, logstoreinput.firmID) &&
        Objects.equals(this.storeManID, logstoreinput.storeManID) &&
        Objects.equals(this.reservedForDocType, logstoreinput.reservedForDocType) &&
        Objects.equals(this.reservedForDocID, logstoreinput.reservedForDocID) &&
        Objects.equals(this.masterDocCLSID, logstoreinput.masterDocCLSID) &&
        Objects.equals(this.masterDocumentID, logstoreinput.masterDocumentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, docQueueID, periodID, ordNumber, docDateDATE, createdByID, correctedByID, newRelatedType, newRelatedDocumentID, documentType, storeDocumentType, storeDocumentID, storeGatewayID, executed, noStoreDocument, description, externalNumber, firmID, storeManID, reservedForDocType, reservedForDocID, masterDocCLSID, masterDocumentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logstoreinput {\n");
    
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
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    storeDocumentType: ").append(toIndentedString(storeDocumentType)).append("\n");
    sb.append("    storeDocumentID: ").append(toIndentedString(storeDocumentID)).append("\n");
    sb.append("    storeGatewayID: ").append(toIndentedString(storeGatewayID)).append("\n");
    sb.append("    executed: ").append(toIndentedString(executed)).append("\n");
    sb.append("    noStoreDocument: ").append(toIndentedString(noStoreDocument)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    storeManID: ").append(toIndentedString(storeManID)).append("\n");
    sb.append("    reservedForDocType: ").append(toIndentedString(reservedForDocType)).append("\n");
    sb.append("    reservedForDocID: ").append(toIndentedString(reservedForDocID)).append("\n");
    sb.append("    masterDocCLSID: ").append(toIndentedString(masterDocCLSID)).append("\n");
    sb.append("    masterDocumentID: ").append(toIndentedString(masterDocumentID)).append("\n");
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

