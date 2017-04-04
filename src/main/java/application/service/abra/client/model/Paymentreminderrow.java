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
 * Paymentreminderrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Paymentreminderrow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("incometype_id")
  private String incometypeId = null;

  @SerializedName("datepenaltyfrom$date")
  private DateTime datepenaltyfromdate = null;

  @SerializedName("datepenaltyto$date")
  private DateTime datepenaltytodate = null;

  @SerializedName("amountinvoice")
  private Double amountinvoice = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("penaltypercent")
  private Double penaltypercent = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("numberpenaltydays")
  private Integer numberpenaltydays = null;

  public Paymentreminderrow displayname(String displayname) {
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

  public Paymentreminderrow id(String id) {
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

  public Paymentreminderrow classid(String classid) {
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

  public Paymentreminderrow objversion(Integer objversion) {
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

  public Paymentreminderrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu upomínka [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu upomínka [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Paymentreminderrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Paymentreminderrow tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * celkem [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "celkem [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Paymentreminderrow localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * celkem lokálně [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Paymentreminderrow divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Paymentreminderrow busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Paymentreminderrow bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * o.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "o.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Paymentreminderrow incometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
    return this;
  }

   /**
   * typ příjmu; id objektu typ příjmu [persistentní položka]
   * @return incometypeId
  **/
  @ApiModelProperty(example = "null", value = "typ příjmu; id objektu typ příjmu [persistentní položka]")
  public String getIncometypeId() {
    return incometypeId;
  }

  public void setIncometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
  }

  public Paymentreminderrow datepenaltyfromdate(DateTime datepenaltyfromdate) {
    this.datepenaltyfromdate = datepenaltyfromdate;
    return this;
  }

   /**
   * poč. dat. sankce [persistentní položka]
   * @return datepenaltyfromdate
  **/
  @ApiModelProperty(example = "null", value = "poč. dat. sankce [persistentní položka]")
  public DateTime getDatepenaltyfromdate() {
    return datepenaltyfromdate;
  }

  public void setDatepenaltyfromdate(DateTime datepenaltyfromdate) {
    this.datepenaltyfromdate = datepenaltyfromdate;
  }

  public Paymentreminderrow datepenaltytodate(DateTime datepenaltytodate) {
    this.datepenaltytodate = datepenaltytodate;
    return this;
  }

   /**
   * konc. dat. sankce [persistentní položka]
   * @return datepenaltytodate
  **/
  @ApiModelProperty(example = "null", value = "konc. dat. sankce [persistentní položka]")
  public DateTime getDatepenaltytodate() {
    return datepenaltytodate;
  }

  public void setDatepenaltytodate(DateTime datepenaltytodate) {
    this.datepenaltytodate = datepenaltytodate;
  }

  public Paymentreminderrow amountinvoice(Double amountinvoice) {
    this.amountinvoice = amountinvoice;
    return this;
  }

   /**
   * Částka pro výp. sankce [persistentní položka]
   * @return amountinvoice
  **/
  @ApiModelProperty(example = "null", value = "Částka pro výp. sankce [persistentní položka]")
  public Double getAmountinvoice() {
    return amountinvoice;
  }

  public void setAmountinvoice(Double amountinvoice) {
    this.amountinvoice = amountinvoice;
  }

  public Paymentreminderrow text(String text) {
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

  public Paymentreminderrow penaltypercent(Double penaltypercent) {
    this.penaltypercent = penaltypercent;
    return this;
  }

   /**
   * Úrok z prodlení [%] [persistentní položka]
   * @return penaltypercent
  **/
  @ApiModelProperty(example = "null", value = "Úrok z prodlení [%] [persistentní položka]")
  public Double getPenaltypercent() {
    return penaltypercent;
  }

  public void setPenaltypercent(Double penaltypercent) {
    this.penaltypercent = penaltypercent;
  }

  public Paymentreminderrow busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }

  public Paymentreminderrow numberpenaltydays(Integer numberpenaltydays) {
    this.numberpenaltydays = numberpenaltydays;
    return this;
  }

   /**
   * počet dní
   * @return numberpenaltydays
  **/
  @ApiModelProperty(example = "null", value = "počet dní")
  public Integer getNumberpenaltydays() {
    return numberpenaltydays;
  }

  public void setNumberpenaltydays(Integer numberpenaltydays) {
    this.numberpenaltydays = numberpenaltydays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paymentreminderrow paymentreminderrow = (Paymentreminderrow) o;
    return Objects.equals(this.displayname, paymentreminderrow.displayname) &&
        Objects.equals(this.id, paymentreminderrow.id) &&
        Objects.equals(this.classid, paymentreminderrow.classid) &&
        Objects.equals(this.objversion, paymentreminderrow.objversion) &&
        Objects.equals(this.parentId, paymentreminderrow.parentId) &&
        Objects.equals(this.posindex, paymentreminderrow.posindex) &&
        Objects.equals(this.tamount, paymentreminderrow.tamount) &&
        Objects.equals(this.localtamount, paymentreminderrow.localtamount) &&
        Objects.equals(this.divisionId, paymentreminderrow.divisionId) &&
        Objects.equals(this.busorderId, paymentreminderrow.busorderId) &&
        Objects.equals(this.bustransactionId, paymentreminderrow.bustransactionId) &&
        Objects.equals(this.incometypeId, paymentreminderrow.incometypeId) &&
        Objects.equals(this.datepenaltyfromdate, paymentreminderrow.datepenaltyfromdate) &&
        Objects.equals(this.datepenaltytodate, paymentreminderrow.datepenaltytodate) &&
        Objects.equals(this.amountinvoice, paymentreminderrow.amountinvoice) &&
        Objects.equals(this.text, paymentreminderrow.text) &&
        Objects.equals(this.penaltypercent, paymentreminderrow.penaltypercent) &&
        Objects.equals(this.busprojectId, paymentreminderrow.busprojectId) &&
        Objects.equals(this.numberpenaltydays, paymentreminderrow.numberpenaltydays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, tamount, localtamount, divisionId, busorderId, bustransactionId, incometypeId, datepenaltyfromdate, datepenaltytodate, amountinvoice, text, penaltypercent, busprojectId, numberpenaltydays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paymentreminderrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    incometypeId: ").append(toIndentedString(incometypeId)).append("\n");
    sb.append("    datepenaltyfromdate: ").append(toIndentedString(datepenaltyfromdate)).append("\n");
    sb.append("    datepenaltytodate: ").append(toIndentedString(datepenaltytodate)).append("\n");
    sb.append("    amountinvoice: ").append(toIndentedString(amountinvoice)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    penaltypercent: ").append(toIndentedString(penaltypercent)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    numberpenaltydays: ").append(toIndentedString(numberpenaltydays)).append("\n");
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
