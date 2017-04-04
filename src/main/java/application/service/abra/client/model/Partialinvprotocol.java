/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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
 * Partialinvprotocol
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Partialinvprotocol   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("dateofbegin$date")
  private DateTime dateofbegindate = null;

  @SerializedName("dateofend$date")
  private DateTime dateofenddate = null;

  @SerializedName("mainprotocol_id")
  private String mainprotocolId = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("readerid")
  private String readerid = null;

  @SerializedName("correction")
  private Boolean correction = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("addrows")
  private Boolean addrows = null;

  public Partialinvprotocol displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Partialinvprotocol id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Partialinvprotocol classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Partialinvprotocol objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Partialinvprotocol docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Partialinvprotocol periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Partialinvprotocol ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Partialinvprotocol docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Partialinvprotocol createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Partialinvprotocol correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Partialinvprotocol newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Partialinvprotocol newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Partialinvprotocol dateofbegindate(DateTime dateofbegindate) {
    this.dateofbegindate = dateofbegindate;
    return this;
  }

   /**
   * datum zahájení inventury [persistentní položka]
   * @return dateofbegindate
  **/
  @ApiModelProperty(example = "null", value = "datum zahájení inventury [persistentní položka]")
  public DateTime getDateofbegindate() {
    return dateofbegindate;
  }

  public void setDateofbegindate(DateTime dateofbegindate) {
    this.dateofbegindate = dateofbegindate;
  }

  public Partialinvprotocol dateofenddate(DateTime dateofenddate) {
    this.dateofenddate = dateofenddate;
    return this;
  }

   /**
   * datum ukončení inventury [persistentní položka]
   * @return dateofenddate
  **/
  @ApiModelProperty(example = "null", value = "datum ukončení inventury [persistentní položka]")
  public DateTime getDateofenddate() {
    return dateofenddate;
  }

  public void setDateofenddate(DateTime dateofenddate) {
    this.dateofenddate = dateofenddate;
  }

  public Partialinvprotocol mainprotocolId(String mainprotocolId) {
    this.mainprotocolId = mainprotocolId;
    return this;
  }

   /**
   * hlavní inventární protokol; id objektu hlavní inventární protokol [persistentní položka]
   * @return mainprotocolId
  **/
  @ApiModelProperty(example = "null", value = "hlavní inventární protokol; id objektu hlavní inventární protokol [persistentní položka]")
  public String getMainprotocolId() {
    return mainprotocolId;
  }

  public void setMainprotocolId(String mainprotocolId) {
    this.mainprotocolId = mainprotocolId;
  }

  public Partialinvprotocol closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * uzavřen [persistentní položka]
   * @return closed
  **/
  @ApiModelProperty(example = "null", value = "uzavřen [persistentní položka]")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Partialinvprotocol description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Partialinvprotocol readerid(String readerid) {
    this.readerid = readerid;
    return this;
  }

   /**
   * Čtečka [persistentní položka]
   * @return readerid
  **/
  @ApiModelProperty(example = "null", value = "Čtečka [persistentní položka]")
  public String getReaderid() {
    return readerid;
  }

  public void setReaderid(String readerid) {
    this.readerid = readerid;
  }

  public Partialinvprotocol correction(Boolean correction) {
    this.correction = correction;
    return this;
  }

   /**
   * korekční doklad [persistentní položka]
   * @return correction
  **/
  @ApiModelProperty(example = "null", value = "korekční doklad [persistentní položka]")
  public Boolean getCorrection() {
    return correction;
  }

  public void setCorrection(Boolean correction) {
    this.correction = correction;
  }

  public Partialinvprotocol userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * uživatel; id objektu uživatel [persistentní položka]
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "uživatel; id objektu uživatel [persistentní položka]")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Partialinvprotocol addrows(Boolean addrows) {
    this.addrows = addrows;
    return this;
  }

   /**
   * povoleno přidávat řádky [persistentní položka]
   * @return addrows
  **/
  @ApiModelProperty(example = "null", value = "povoleno přidávat řádky [persistentní položka]")
  public Boolean getAddrows() {
    return addrows;
  }

  public void setAddrows(Boolean addrows) {
    this.addrows = addrows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partialinvprotocol partialinvprotocol = (Partialinvprotocol) o;
    return Objects.equals(this.displayname, partialinvprotocol.displayname) &&
        Objects.equals(this.id, partialinvprotocol.id) &&
        Objects.equals(this.classid, partialinvprotocol.classid) &&
        Objects.equals(this.objversion, partialinvprotocol.objversion) &&
        Objects.equals(this.docqueueId, partialinvprotocol.docqueueId) &&
        Objects.equals(this.periodId, partialinvprotocol.periodId) &&
        Objects.equals(this.ordnumber, partialinvprotocol.ordnumber) &&
        Objects.equals(this.docdatedate, partialinvprotocol.docdatedate) &&
        Objects.equals(this.createdbyId, partialinvprotocol.createdbyId) &&
        Objects.equals(this.correctedbyId, partialinvprotocol.correctedbyId) &&
        Objects.equals(this.newrelatedtype, partialinvprotocol.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, partialinvprotocol.newrelateddocumentId) &&
        Objects.equals(this.dateofbegindate, partialinvprotocol.dateofbegindate) &&
        Objects.equals(this.dateofenddate, partialinvprotocol.dateofenddate) &&
        Objects.equals(this.mainprotocolId, partialinvprotocol.mainprotocolId) &&
        Objects.equals(this.closed, partialinvprotocol.closed) &&
        Objects.equals(this.description, partialinvprotocol.description) &&
        Objects.equals(this.readerid, partialinvprotocol.readerid) &&
        Objects.equals(this.correction, partialinvprotocol.correction) &&
        Objects.equals(this.userId, partialinvprotocol.userId) &&
        Objects.equals(this.addrows, partialinvprotocol.addrows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, dateofbegindate, dateofenddate, mainprotocolId, closed, description, readerid, correction, userId, addrows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partialinvprotocol {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    dateofbegindate: ").append(toIndentedString(dateofbegindate)).append("\n");
    sb.append("    dateofenddate: ").append(toIndentedString(dateofenddate)).append("\n");
    sb.append("    mainprotocolId: ").append(toIndentedString(mainprotocolId)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    readerid: ").append(toIndentedString(readerid)).append("\n");
    sb.append("    correction: ").append(toIndentedString(correction)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    addrows: ").append(toIndentedString(addrows)).append("\n");
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
