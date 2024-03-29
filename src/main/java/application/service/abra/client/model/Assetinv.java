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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Assetinv
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Assetinv   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Assetinvlist> rows = new ArrayList<Assetinvlist>();

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

  @SerializedName("committee_id")
  private String committeeId = null;

  @SerializedName("inventorystate")
  private Integer inventorystate = null;

  @SerializedName("inventorytype")
  private Integer inventorytype = null;

  @SerializedName("restrictionkind")
  private Integer restrictionkind = null;

  @SerializedName("startdate$date")
  private DateTime startdatedate = null;

  @SerializedName("enddate$date")
  private DateTime enddatedate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("inventorytypeastext")
  private String inventorytypeastext = null;

  @SerializedName("inventorystateastext")
  private String inventorystateastext = null;

  @SerializedName("restrictionkindastext")
  private String restrictionkindastext = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("correctedat$date")
  private DateTime correctedatdate = null;

  public Assetinv displayname(String displayname) {
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

  public Assetinv id(String id) {
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

  public Assetinv classid(String classid) {
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

  public Assetinv objversion(Integer objversion) {
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

  public Assetinv rows(List<Assetinvlist> rows) {
    this.rows = rows;
    return this;
  }

  public Assetinv addRowsItem(Assetinvlist rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo inventarizační seznam majetku [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo inventarizační seznam majetku [nepersistentní položka]")
  public List<Assetinvlist> getRows() {
    return rows;
  }

  public void setRows(List<Assetinvlist> rows) {
    this.rows = rows;
  }

  public Assetinv docqueueId(String docqueueId) {
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

  public Assetinv periodId(String periodId) {
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

  public Assetinv ordnumber(Integer ordnumber) {
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

  public Assetinv docdatedate(DateTime docdatedate) {
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

  public Assetinv createdbyId(String createdbyId) {
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

  public Assetinv correctedbyId(String correctedbyId) {
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

  public Assetinv newrelatedtype(Integer newrelatedtype) {
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

  public Assetinv newrelateddocumentId(String newrelateddocumentId) {
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

  public Assetinv committeeId(String committeeId) {
    this.committeeId = committeeId;
    return this;
  }

   /**
   * Ústřední inventarizační komise; id objektu inventarizační komise [persistentní položka]
   * @return committeeId
  **/
  @ApiModelProperty(example = "null", value = "Ústřední inventarizační komise; id objektu inventarizační komise [persistentní položka]")
  public String getCommitteeId() {
    return committeeId;
  }

  public void setCommitteeId(String committeeId) {
    this.committeeId = committeeId;
  }

  public Assetinv inventorystate(Integer inventorystate) {
    this.inventorystate = inventorystate;
    return this;
  }

   /**
   * stav inventury [persistentní položka]
   * @return inventorystate
  **/
  @ApiModelProperty(example = "null", value = "stav inventury [persistentní položka]")
  public Integer getInventorystate() {
    return inventorystate;
  }

  public void setInventorystate(Integer inventorystate) {
    this.inventorystate = inventorystate;
  }

  public Assetinv inventorytype(Integer inventorytype) {
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

  public Assetinv restrictionkind(Integer restrictionkind) {
    this.restrictionkind = restrictionkind;
    return this;
  }

   /**
   * podmínka výběru majetku [persistentní položka]
   * @return restrictionkind
  **/
  @ApiModelProperty(example = "null", value = "podmínka výběru majetku [persistentní položka]")
  public Integer getRestrictionkind() {
    return restrictionkind;
  }

  public void setRestrictionkind(Integer restrictionkind) {
    this.restrictionkind = restrictionkind;
  }

  public Assetinv startdatedate(DateTime startdatedate) {
    this.startdatedate = startdatedate;
    return this;
  }

   /**
   * datum zahájení [persistentní položka]
   * @return startdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum zahájení [persistentní položka]")
  public DateTime getStartdatedate() {
    return startdatedate;
  }

  public void setStartdatedate(DateTime startdatedate) {
    this.startdatedate = startdatedate;
  }

  public Assetinv enddatedate(DateTime enddatedate) {
    this.enddatedate = enddatedate;
    return this;
  }

   /**
   * datum ukončení [persistentní položka]
   * @return enddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum ukončení [persistentní položka]")
  public DateTime getEnddatedate() {
    return enddatedate;
  }

  public void setEnddatedate(DateTime enddatedate) {
    this.enddatedate = enddatedate;
  }

  public Assetinv description(String description) {
    this.description = description;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Assetinv inventorytypeastext(String inventorytypeastext) {
    this.inventorytypeastext = inventorytypeastext;
    return this;
  }

   /**
   * typ inventury
   * @return inventorytypeastext
  **/
  @ApiModelProperty(example = "null", value = "typ inventury")
  public String getInventorytypeastext() {
    return inventorytypeastext;
  }

  public void setInventorytypeastext(String inventorytypeastext) {
    this.inventorytypeastext = inventorytypeastext;
  }

  public Assetinv inventorystateastext(String inventorystateastext) {
    this.inventorystateastext = inventorystateastext;
    return this;
  }

   /**
   * stav inventury
   * @return inventorystateastext
  **/
  @ApiModelProperty(example = "null", value = "stav inventury")
  public String getInventorystateastext() {
    return inventorystateastext;
  }

  public void setInventorystateastext(String inventorystateastext) {
    this.inventorystateastext = inventorystateastext;
  }

  public Assetinv restrictionkindastext(String restrictionkindastext) {
    this.restrictionkindastext = restrictionkindastext;
    return this;
  }

   /**
   * podmínka výběru majetku
   * @return restrictionkindastext
  **/
  @ApiModelProperty(example = "null", value = "podmínka výběru majetku")
  public String getRestrictionkindastext() {
    return restrictionkindastext;
  }

  public void setRestrictionkindastext(String restrictionkindastext) {
    this.restrictionkindastext = restrictionkindastext;
  }

  public Assetinv createdatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
    return this;
  }

   /**
   * vytvořeno [persistentní položka]
   * @return createdatdate
  **/
  @ApiModelProperty(example = "null", value = "vytvořeno [persistentní položka]")
  public DateTime getCreatedatdate() {
    return createdatdate;
  }

  public void setCreatedatdate(DateTime createdatdate) {
    this.createdatdate = createdatdate;
  }

  public Assetinv correctedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
    return this;
  }

   /**
   * opraveno [persistentní položka]
   * @return correctedatdate
  **/
  @ApiModelProperty(example = "null", value = "opraveno [persistentní položka]")
  public DateTime getCorrectedatdate() {
    return correctedatdate;
  }

  public void setCorrectedatdate(DateTime correctedatdate) {
    this.correctedatdate = correctedatdate;
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
    return Objects.equals(this.displayname, assetinv.displayname) &&
        Objects.equals(this.id, assetinv.id) &&
        Objects.equals(this.classid, assetinv.classid) &&
        Objects.equals(this.objversion, assetinv.objversion) &&
        Objects.equals(this.rows, assetinv.rows) &&
        Objects.equals(this.docqueueId, assetinv.docqueueId) &&
        Objects.equals(this.periodId, assetinv.periodId) &&
        Objects.equals(this.ordnumber, assetinv.ordnumber) &&
        Objects.equals(this.docdatedate, assetinv.docdatedate) &&
        Objects.equals(this.createdbyId, assetinv.createdbyId) &&
        Objects.equals(this.correctedbyId, assetinv.correctedbyId) &&
        Objects.equals(this.newrelatedtype, assetinv.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, assetinv.newrelateddocumentId) &&
        Objects.equals(this.committeeId, assetinv.committeeId) &&
        Objects.equals(this.inventorystate, assetinv.inventorystate) &&
        Objects.equals(this.inventorytype, assetinv.inventorytype) &&
        Objects.equals(this.restrictionkind, assetinv.restrictionkind) &&
        Objects.equals(this.startdatedate, assetinv.startdatedate) &&
        Objects.equals(this.enddatedate, assetinv.enddatedate) &&
        Objects.equals(this.description, assetinv.description) &&
        Objects.equals(this.inventorytypeastext, assetinv.inventorytypeastext) &&
        Objects.equals(this.inventorystateastext, assetinv.inventorystateastext) &&
        Objects.equals(this.restrictionkindastext, assetinv.restrictionkindastext) &&
        Objects.equals(this.createdatdate, assetinv.createdatdate) &&
        Objects.equals(this.correctedatdate, assetinv.correctedatdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, committeeId, inventorystate, inventorytype, restrictionkind, startdatedate, enddatedate, description, inventorytypeastext, inventorystateastext, restrictionkindastext, createdatdate, correctedatdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetinv {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    committeeId: ").append(toIndentedString(committeeId)).append("\n");
    sb.append("    inventorystate: ").append(toIndentedString(inventorystate)).append("\n");
    sb.append("    inventorytype: ").append(toIndentedString(inventorytype)).append("\n");
    sb.append("    restrictionkind: ").append(toIndentedString(restrictionkind)).append("\n");
    sb.append("    startdatedate: ").append(toIndentedString(startdatedate)).append("\n");
    sb.append("    enddatedate: ").append(toIndentedString(enddatedate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inventorytypeastext: ").append(toIndentedString(inventorytypeastext)).append("\n");
    sb.append("    inventorystateastext: ").append(toIndentedString(inventorystateastext)).append("\n");
    sb.append("    restrictionkindastext: ").append(toIndentedString(restrictionkindastext)).append("\n");
    sb.append("    createdatdate: ").append(toIndentedString(createdatdate)).append("\n");
    sb.append("    correctedatdate: ").append(toIndentedString(correctedatdate)).append("\n");
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

