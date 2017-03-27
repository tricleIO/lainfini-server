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
 * Intrastatreport
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Intrastatreport   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Intrastatreportdeclaration> rows = new ArrayList<Intrastatreportdeclaration>();

  @SerializedName("IntrastatReport_ID")
  private String intrastatReportID = null;

  @SerializedName("Envelopeid")
  private String envelopeid = null;

  @SerializedName("DocDate$DATE")
  private DateTime docDateDATE = null;

  @SerializedName("DateFrom$DATE")
  private DateTime dateFromDATE = null;

  @SerializedName("DateTo$DATE")
  private DateTime dateToDATE = null;

  @SerializedName("CommunicationDocument_ID")
  private String communicationDocumentID = null;

  @SerializedName("Conditions")
  private byte[] conditions = null;

  @SerializedName("Status")
  private Integer status = null;

  @SerializedName("IsChanged")
  private Boolean isChanged = null;

  @SerializedName("Origin")
  private Integer origin = null;

  @SerializedName("DifferentFromPreviousReport")
  private Boolean differentFromPreviousReport = null;

  @SerializedName("IsOnlyDeleting")
  private Boolean isOnlyDeleting = null;

  @SerializedName("ExportVersion")
  private Integer exportVersion = null;

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

  public Intrastatreport rows(List<Intrastatreportdeclaration> rows) {
    this.rows = rows;
    return this;
  }

  public Intrastatreport addRowsItem(Intrastatreportdeclaration rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Deklarace INTRASTAT [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Deklarace INTRASTAT [nepersistentní položka]")
  public List<Intrastatreportdeclaration> getRows() {
    return rows;
  }

  public void setRows(List<Intrastatreportdeclaration> rows) {
    this.rows = rows;
  }

  public Intrastatreport intrastatReportID(String intrastatReportID) {
    this.intrastatReportID = intrastatReportID;
    return this;
  }

   /**
   * Opravované podání; ID objektu Podání INTRASTAT [persistentní položka]
   * @return intrastatReportID
  **/
  @ApiModelProperty(example = "null", value = "Opravované podání; ID objektu Podání INTRASTAT [persistentní položka]")
  public String getIntrastatReportID() {
    return intrastatReportID;
  }

  public void setIntrastatReportID(String intrastatReportID) {
    this.intrastatReportID = intrastatReportID;
  }

  public Intrastatreport envelopeid(String envelopeid) {
    this.envelopeid = envelopeid;
    return this;
  }

   /**
   * Identifikátor PVS [persistentní položka]
   * @return envelopeid
  **/
  @ApiModelProperty(example = "null", value = "Identifikátor PVS [persistentní položka]")
  public String getEnvelopeid() {
    return envelopeid;
  }

  public void setEnvelopeid(String envelopeid) {
    this.envelopeid = envelopeid;
  }

  public Intrastatreport docDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
    return this;
  }

   /**
   * Datum a čas generování [persistentní položka]
   * @return docDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum a čas generování [persistentní položka]")
  public DateTime getDocDateDATE() {
    return docDateDATE;
  }

  public void setDocDateDATE(DateTime docDateDATE) {
    this.docDateDATE = docDateDATE;
  }

  public Intrastatreport dateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
    return this;
  }

   /**
   * Datum od [persistentní položka]
   * @return dateFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum od [persistentní položka]")
  public DateTime getDateFromDATE() {
    return dateFromDATE;
  }

  public void setDateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
  }

  public Intrastatreport dateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
    return this;
  }

   /**
   * Datum do [persistentní položka]
   * @return dateToDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum do [persistentní položka]")
  public DateTime getDateToDATE() {
    return dateToDATE;
  }

  public void setDateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
  }

  public Intrastatreport communicationDocumentID(String communicationDocumentID) {
    this.communicationDocumentID = communicationDocumentID;
    return this;
  }

   /**
   * Dokument; ID objektu Dokument [persistentní položka]
   * @return communicationDocumentID
  **/
  @ApiModelProperty(example = "null", value = "Dokument; ID objektu Dokument [persistentní položka]")
  public String getCommunicationDocumentID() {
    return communicationDocumentID;
  }

  public void setCommunicationDocumentID(String communicationDocumentID) {
    this.communicationDocumentID = communicationDocumentID;
  }

  public Intrastatreport conditions(byte[] conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Podmínky [persistentní položka]
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "Podmínky [persistentní položka]")
  public byte[] getConditions() {
    return conditions;
  }

  public void setConditions(byte[] conditions) {
    this.conditions = conditions;
  }

  public Intrastatreport status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status [persistentní položka]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status [persistentní položka]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

   /**
   * Podklady změněny
   * @return isChanged
  **/
  @ApiModelProperty(example = "null", value = "Podklady změněny")
  public Boolean getIsChanged() {
    return isChanged;
  }

  public Intrastatreport origin(Integer origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Původ [persistentní položka]
   * @return origin
  **/
  @ApiModelProperty(example = "null", value = "Původ [persistentní položka]")
  public Integer getOrigin() {
    return origin;
  }

  public void setOrigin(Integer origin) {
    this.origin = origin;
  }

   /**
   * Různý od předchozího
   * @return differentFromPreviousReport
  **/
  @ApiModelProperty(example = "null", value = "Různý od předchozího")
  public Boolean getDifferentFromPreviousReport() {
    return differentFromPreviousReport;
  }

   /**
   * Obsahuje pouze mazací deklarace
   * @return isOnlyDeleting
  **/
  @ApiModelProperty(example = "null", value = "Obsahuje pouze mazací deklarace")
  public Boolean getIsOnlyDeleting() {
    return isOnlyDeleting;
  }

  public Intrastatreport exportVersion(Integer exportVersion) {
    this.exportVersion = exportVersion;
    return this;
  }

   /**
   * Verze exportu [persistentní položka]
   * @return exportVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze exportu [persistentní položka]")
  public Integer getExportVersion() {
    return exportVersion;
  }

  public void setExportVersion(Integer exportVersion) {
    this.exportVersion = exportVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intrastatreport intrastatreport = (Intrastatreport) o;
    return Objects.equals(this.displayName, intrastatreport.displayName) &&
        Objects.equals(this.ID, intrastatreport.ID) &&
        Objects.equals(this.classID, intrastatreport.classID) &&
        Objects.equals(this.objVersion, intrastatreport.objVersion) &&
        Objects.equals(this.rows, intrastatreport.rows) &&
        Objects.equals(this.intrastatReportID, intrastatreport.intrastatReportID) &&
        Objects.equals(this.envelopeid, intrastatreport.envelopeid) &&
        Objects.equals(this.docDateDATE, intrastatreport.docDateDATE) &&
        Objects.equals(this.dateFromDATE, intrastatreport.dateFromDATE) &&
        Objects.equals(this.dateToDATE, intrastatreport.dateToDATE) &&
        Objects.equals(this.communicationDocumentID, intrastatreport.communicationDocumentID) &&
        Objects.equals(this.conditions, intrastatreport.conditions) &&
        Objects.equals(this.status, intrastatreport.status) &&
        Objects.equals(this.isChanged, intrastatreport.isChanged) &&
        Objects.equals(this.origin, intrastatreport.origin) &&
        Objects.equals(this.differentFromPreviousReport, intrastatreport.differentFromPreviousReport) &&
        Objects.equals(this.isOnlyDeleting, intrastatreport.isOnlyDeleting) &&
        Objects.equals(this.exportVersion, intrastatreport.exportVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, intrastatReportID, envelopeid, docDateDATE, dateFromDATE, dateToDATE, communicationDocumentID, conditions, status, isChanged, origin, differentFromPreviousReport, isOnlyDeleting, exportVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intrastatreport {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    intrastatReportID: ").append(toIndentedString(intrastatReportID)).append("\n");
    sb.append("    envelopeid: ").append(toIndentedString(envelopeid)).append("\n");
    sb.append("    docDateDATE: ").append(toIndentedString(docDateDATE)).append("\n");
    sb.append("    dateFromDATE: ").append(toIndentedString(dateFromDATE)).append("\n");
    sb.append("    dateToDATE: ").append(toIndentedString(dateToDATE)).append("\n");
    sb.append("    communicationDocumentID: ").append(toIndentedString(communicationDocumentID)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isChanged: ").append(toIndentedString(isChanged)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    differentFromPreviousReport: ").append(toIndentedString(differentFromPreviousReport)).append("\n");
    sb.append("    isOnlyDeleting: ").append(toIndentedString(isOnlyDeleting)).append("\n");
    sb.append("    exportVersion: ").append(toIndentedString(exportVersion)).append("\n");
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

