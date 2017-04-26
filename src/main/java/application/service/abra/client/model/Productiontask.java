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
 * Productiontask
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Productiontask   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Productiontaskrow> rows = new ArrayList<Productiontaskrow>();

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("plannedquantity")
  private Double plannedquantity = null;

  @SerializedName("deadline$date")
  private DateTime deadlinedate = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("ownertype")
  private Integer ownertype = null;

  @SerializedName("createdat$date")
  private DateTime createdatdate = null;

  @SerializedName("correctedat$date")
  private DateTime correctedatdate = null;

  public Productiontask displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Productiontask id(String id) {
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

  public Productiontask classid(String classid) {
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

  public Productiontask objversion(Integer objversion) {
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

  public Productiontask rows(List<Productiontaskrow> rows) {
    this.rows = rows;
    return this;
  }

  public Productiontask addRowsItem(Productiontaskrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo výrobní úloha - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo výrobní úloha - řádek [nepersistentní položka]")
  public List<Productiontaskrow> getRows() {
    return rows;
  }

  public void setRows(List<Productiontaskrow> rows) {
    this.rows = rows;
  }

  public Productiontask storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skl. karta výrobku; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skl. karta výrobku; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Productiontask storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad výrobku; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad výrobku; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Productiontask plannedquantity(Double plannedquantity) {
    this.plannedquantity = plannedquantity;
    return this;
  }

   /**
   * plánováno [persistentní položka]
   * @return plannedquantity
  **/
  @ApiModelProperty(example = "null", value = "plánováno [persistentní položka]")
  public Double getPlannedquantity() {
    return plannedquantity;
  }

  public void setPlannedquantity(Double plannedquantity) {
    this.plannedquantity = plannedquantity;
  }

  public Productiontask deadlinedate(DateTime deadlinedate) {
    this.deadlinedate = deadlinedate;
    return this;
  }

   /**
   * termín [persistentní položka]
   * @return deadlinedate
  **/
  @ApiModelProperty(example = "null", value = "termín [persistentní položka]")
  public DateTime getDeadlinedate() {
    return deadlinedate;
  }

  public void setDeadlinedate(DateTime deadlinedate) {
    this.deadlinedate = deadlinedate;
  }

  public Productiontask quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * přijato výrobků [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "přijato výrobků [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Productiontask docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Productiontask periodId(String periodId) {
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

  public Productiontask ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * Číslo dokladu [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "Číslo dokladu [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Productiontask text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text [persistentní položka]
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "text [persistentní položka]")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Productiontask ownertype(Integer ownertype) {
    this.ownertype = ownertype;
    return this;
  }

   /**
   * typ vlastníka [persistentní položka]
   * @return ownertype
  **/
  @ApiModelProperty(example = "null", value = "typ vlastníka [persistentní položka]")
  public Integer getOwnertype() {
    return ownertype;
  }

  public void setOwnertype(Integer ownertype) {
    this.ownertype = ownertype;
  }

  public Productiontask createdatdate(DateTime createdatdate) {
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

  public Productiontask correctedatdate(DateTime correctedatdate) {
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
    Productiontask productiontask = (Productiontask) o;
    return Objects.equals(this.displayname, productiontask.displayname) &&
        Objects.equals(this.id, productiontask.id) &&
        Objects.equals(this.classid, productiontask.classid) &&
        Objects.equals(this.objversion, productiontask.objversion) &&
        Objects.equals(this.rows, productiontask.rows) &&
        Objects.equals(this.storecardId, productiontask.storecardId) &&
        Objects.equals(this.storeId, productiontask.storeId) &&
        Objects.equals(this.plannedquantity, productiontask.plannedquantity) &&
        Objects.equals(this.deadlinedate, productiontask.deadlinedate) &&
        Objects.equals(this.quantity, productiontask.quantity) &&
        Objects.equals(this.docqueueId, productiontask.docqueueId) &&
        Objects.equals(this.periodId, productiontask.periodId) &&
        Objects.equals(this.ordnumber, productiontask.ordnumber) &&
        Objects.equals(this.text, productiontask.text) &&
        Objects.equals(this.ownertype, productiontask.ownertype) &&
        Objects.equals(this.createdatdate, productiontask.createdatdate) &&
        Objects.equals(this.correctedatdate, productiontask.correctedatdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, storecardId, storeId, plannedquantity, deadlinedate, quantity, docqueueId, periodId, ordnumber, text, ownertype, createdatdate, correctedatdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Productiontask {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    plannedquantity: ").append(toIndentedString(plannedquantity)).append("\n");
    sb.append("    deadlinedate: ").append(toIndentedString(deadlinedate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    ownertype: ").append(toIndentedString(ownertype)).append("\n");
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

