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
 * Plmexceptionworkplace
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmexceptionworkplace   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Plmexceptionworkplace2> rows = new ArrayList<Plmexceptionworkplace2>();

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

  @SerializedName("corrected$date")
  private DateTime correcteddate = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rowsmindate")
  private DateTime rowsmindate = null;

  @SerializedName("rowsmaxdate")
  private DateTime rowsmaxdate = null;

  public Plmexceptionworkplace displayname(String displayname) {
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

  public Plmexceptionworkplace id(String id) {
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

  public Plmexceptionworkplace classid(String classid) {
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

  public Plmexceptionworkplace objversion(Integer objversion) {
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

  public Plmexceptionworkplace rows(List<Plmexceptionworkplace2> rows) {
    this.rows = rows;
    return this;
  }

  public Plmexceptionworkplace addRowsItem(Plmexceptionworkplace2 rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo výjimka pracoviště - platnost [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo výjimka pracoviště - platnost [nepersistentní položka]")
  public List<Plmexceptionworkplace2> getRows() {
    return rows;
  }

  public void setRows(List<Plmexceptionworkplace2> rows) {
    this.rows = rows;
  }

  public Plmexceptionworkplace docqueueId(String docqueueId) {
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

  public Plmexceptionworkplace periodId(String periodId) {
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

  public Plmexceptionworkplace ordnumber(Integer ordnumber) {
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

  public Plmexceptionworkplace docdatedate(DateTime docdatedate) {
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

  public Plmexceptionworkplace createdbyId(String createdbyId) {
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

  public Plmexceptionworkplace correctedbyId(String correctedbyId) {
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

  public Plmexceptionworkplace newrelatedtype(Integer newrelatedtype) {
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

  public Plmexceptionworkplace newrelateddocumentId(String newrelateddocumentId) {
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

  public Plmexceptionworkplace correcteddate(DateTime correcteddate) {
    this.correcteddate = correcteddate;
    return this;
  }

   /**
   * opraven [persistentní položka]
   * @return correcteddate
  **/
  @ApiModelProperty(example = "null", value = "opraven [persistentní položka]")
  public DateTime getCorrecteddate() {
    return correcteddate;
  }

  public void setCorrecteddate(DateTime correcteddate) {
    this.correcteddate = correcteddate;
  }

  public Plmexceptionworkplace note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Plmexceptionworkplace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plmexceptionworkplace rowsmindate(DateTime rowsmindate) {
    this.rowsmindate = rowsmindate;
    return this;
  }

   /**
   * minimální platnost od
   * @return rowsmindate
  **/
  @ApiModelProperty(example = "null", value = "minimální platnost od")
  public DateTime getRowsmindate() {
    return rowsmindate;
  }

  public void setRowsmindate(DateTime rowsmindate) {
    this.rowsmindate = rowsmindate;
  }

  public Plmexceptionworkplace rowsmaxdate(DateTime rowsmaxdate) {
    this.rowsmaxdate = rowsmaxdate;
    return this;
  }

   /**
   * maximální platnost do
   * @return rowsmaxdate
  **/
  @ApiModelProperty(example = "null", value = "maximální platnost do")
  public DateTime getRowsmaxdate() {
    return rowsmaxdate;
  }

  public void setRowsmaxdate(DateTime rowsmaxdate) {
    this.rowsmaxdate = rowsmaxdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmexceptionworkplace plmexceptionworkplace = (Plmexceptionworkplace) o;
    return Objects.equals(this.displayname, plmexceptionworkplace.displayname) &&
        Objects.equals(this.id, plmexceptionworkplace.id) &&
        Objects.equals(this.classid, plmexceptionworkplace.classid) &&
        Objects.equals(this.objversion, plmexceptionworkplace.objversion) &&
        Objects.equals(this.rows, plmexceptionworkplace.rows) &&
        Objects.equals(this.docqueueId, plmexceptionworkplace.docqueueId) &&
        Objects.equals(this.periodId, plmexceptionworkplace.periodId) &&
        Objects.equals(this.ordnumber, plmexceptionworkplace.ordnumber) &&
        Objects.equals(this.docdatedate, plmexceptionworkplace.docdatedate) &&
        Objects.equals(this.createdbyId, plmexceptionworkplace.createdbyId) &&
        Objects.equals(this.correctedbyId, plmexceptionworkplace.correctedbyId) &&
        Objects.equals(this.newrelatedtype, plmexceptionworkplace.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, plmexceptionworkplace.newrelateddocumentId) &&
        Objects.equals(this.correcteddate, plmexceptionworkplace.correcteddate) &&
        Objects.equals(this.note, plmexceptionworkplace.note) &&
        Objects.equals(this.name, plmexceptionworkplace.name) &&
        Objects.equals(this.rowsmindate, plmexceptionworkplace.rowsmindate) &&
        Objects.equals(this.rowsmaxdate, plmexceptionworkplace.rowsmaxdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, correcteddate, note, name, rowsmindate, rowsmaxdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmexceptionworkplace {\n");
    
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
    sb.append("    correcteddate: ").append(toIndentedString(correcteddate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rowsmindate: ").append(toIndentedString(rowsmindate)).append("\n");
    sb.append("    rowsmaxdate: ").append(toIndentedString(rowsmaxdate)).append("\n");
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
