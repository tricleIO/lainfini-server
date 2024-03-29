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
 * Maininvprotocol
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Maininvprotocol   {
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

  @SerializedName("dateofend$date")
  private DateTime dateofenddate = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("startinglogistic")
  private Boolean startinglogistic = null;

  @SerializedName("inventorytype")
  private Integer inventorytype = null;

  @SerializedName("inventorytypedesc")
  private String inventorytypedesc = null;

  @SerializedName("addrowsfrompip")
  private Boolean addrowsfrompip = null;

  @SerializedName("startedat$date")
  private DateTime startedatdate = null;

  @SerializedName("started")
  private Boolean started = null;

  public Maininvprotocol displayname(String displayname) {
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

  public Maininvprotocol id(String id) {
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

  public Maininvprotocol classid(String classid) {
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

  public Maininvprotocol objversion(Integer objversion) {
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

  public Maininvprotocol docqueueId(String docqueueId) {
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

  public Maininvprotocol periodId(String periodId) {
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

  public Maininvprotocol ordnumber(Integer ordnumber) {
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

  public Maininvprotocol docdatedate(DateTime docdatedate) {
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

  public Maininvprotocol createdbyId(String createdbyId) {
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

  public Maininvprotocol correctedbyId(String correctedbyId) {
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

  public Maininvprotocol newrelatedtype(Integer newrelatedtype) {
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

  public Maininvprotocol newrelateddocumentId(String newrelateddocumentId) {
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

  public Maininvprotocol dateofenddate(DateTime dateofenddate) {
    this.dateofenddate = dateofenddate;
    return this;
  }

   /**
   * rozhodné datum inventury [persistentní položka]
   * @return dateofenddate
  **/
  @ApiModelProperty(example = "null", value = "rozhodné datum inventury [persistentní položka]")
  public DateTime getDateofenddate() {
    return dateofenddate;
  }

  public void setDateofenddate(DateTime dateofenddate) {
    this.dateofenddate = dateofenddate;
  }

  public Maininvprotocol storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Maininvprotocol closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * ukončen [persistentní položka]
   * @return closed
  **/
  @ApiModelProperty(example = "null", value = "ukončen [persistentní položka]")
  public Boolean getClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public Maininvprotocol description(String description) {
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

  public Maininvprotocol startinglogistic(Boolean startinglogistic) {
    this.startinglogistic = startinglogistic;
    return this;
  }

   /**
   * zahájení polohování [persistentní položka]
   * @return startinglogistic
  **/
  @ApiModelProperty(example = "null", value = "zahájení polohování [persistentní položka]")
  public Boolean getStartinglogistic() {
    return startinglogistic;
  }

  public void setStartinglogistic(Boolean startinglogistic) {
    this.startinglogistic = startinglogistic;
  }

  public Maininvprotocol inventorytype(Integer inventorytype) {
    this.inventorytype = inventorytype;
    return this;
  }

   /**
   * typ inventury [persistentní položka]
   * @return inventorytype
  **/
  @ApiModelProperty(example = "null", value = "typ inventury [persistentní položka]")
  public Integer getInventorytype() {
    return inventorytype;
  }

  public void setInventorytype(Integer inventorytype) {
    this.inventorytype = inventorytype;
  }

  public Maininvprotocol inventorytypedesc(String inventorytypedesc) {
    this.inventorytypedesc = inventorytypedesc;
    return this;
  }

   /**
   * popis typu inventury
   * @return inventorytypedesc
  **/
  @ApiModelProperty(example = "null", value = "popis typu inventury")
  public String getInventorytypedesc() {
    return inventorytypedesc;
  }

  public void setInventorytypedesc(String inventorytypedesc) {
    this.inventorytypedesc = inventorytypedesc;
  }

  public Maininvprotocol addrowsfrompip(Boolean addrowsfrompip) {
    this.addrowsfrompip = addrowsfrompip;
    return this;
  }

   /**
   * přidávat řádky z dip [persistentní položka]
   * @return addrowsfrompip
  **/
  @ApiModelProperty(example = "null", value = "přidávat řádky z dip [persistentní položka]")
  public Boolean getAddrowsfrompip() {
    return addrowsfrompip;
  }

  public void setAddrowsfrompip(Boolean addrowsfrompip) {
    this.addrowsfrompip = addrowsfrompip;
  }

  public Maininvprotocol startedatdate(DateTime startedatdate) {
    this.startedatdate = startedatdate;
    return this;
  }

   /**
   * zahájení inventury [persistentní položka]
   * @return startedatdate
  **/
  @ApiModelProperty(example = "null", value = "zahájení inventury [persistentní položka]")
  public DateTime getStartedatdate() {
    return startedatdate;
  }

  public void setStartedatdate(DateTime startedatdate) {
    this.startedatdate = startedatdate;
  }

  public Maininvprotocol started(Boolean started) {
    this.started = started;
    return this;
  }

   /**
   * inventura zahájena
   * @return started
  **/
  @ApiModelProperty(example = "null", value = "inventura zahájena")
  public Boolean getStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Maininvprotocol maininvprotocol = (Maininvprotocol) o;
    return Objects.equals(this.displayname, maininvprotocol.displayname) &&
        Objects.equals(this.id, maininvprotocol.id) &&
        Objects.equals(this.classid, maininvprotocol.classid) &&
        Objects.equals(this.objversion, maininvprotocol.objversion) &&
        Objects.equals(this.docqueueId, maininvprotocol.docqueueId) &&
        Objects.equals(this.periodId, maininvprotocol.periodId) &&
        Objects.equals(this.ordnumber, maininvprotocol.ordnumber) &&
        Objects.equals(this.docdatedate, maininvprotocol.docdatedate) &&
        Objects.equals(this.createdbyId, maininvprotocol.createdbyId) &&
        Objects.equals(this.correctedbyId, maininvprotocol.correctedbyId) &&
        Objects.equals(this.newrelatedtype, maininvprotocol.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, maininvprotocol.newrelateddocumentId) &&
        Objects.equals(this.dateofenddate, maininvprotocol.dateofenddate) &&
        Objects.equals(this.storeId, maininvprotocol.storeId) &&
        Objects.equals(this.closed, maininvprotocol.closed) &&
        Objects.equals(this.description, maininvprotocol.description) &&
        Objects.equals(this.startinglogistic, maininvprotocol.startinglogistic) &&
        Objects.equals(this.inventorytype, maininvprotocol.inventorytype) &&
        Objects.equals(this.inventorytypedesc, maininvprotocol.inventorytypedesc) &&
        Objects.equals(this.addrowsfrompip, maininvprotocol.addrowsfrompip) &&
        Objects.equals(this.startedatdate, maininvprotocol.startedatdate) &&
        Objects.equals(this.started, maininvprotocol.started);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, dateofenddate, storeId, closed, description, startinglogistic, inventorytype, inventorytypedesc, addrowsfrompip, startedatdate, started);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Maininvprotocol {\n");
    
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
    sb.append("    dateofenddate: ").append(toIndentedString(dateofenddate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startinglogistic: ").append(toIndentedString(startinglogistic)).append("\n");
    sb.append("    inventorytype: ").append(toIndentedString(inventorytype)).append("\n");
    sb.append("    inventorytypedesc: ").append(toIndentedString(inventorytypedesc)).append("\n");
    sb.append("    addrowsfrompip: ").append(toIndentedString(addrowsfrompip)).append("\n");
    sb.append("    startedatdate: ").append(toIndentedString(startedatdate)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
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

