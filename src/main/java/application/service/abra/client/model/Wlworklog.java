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
 * Wlworklog
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wlworklog   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("worker_id")
  private String workerId = null;

  @SerializedName("entrytype_id")
  private String entrytypeId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("basetype")
  private Integer basetype = null;

  @SerializedName("entryvalue")
  private Double entryvalue = null;

  @SerializedName("begindate$date")
  private DateTime begindatedate = null;

  @SerializedName("enddate$date")
  private DateTime enddatedate = null;

  @SerializedName("lengthdate$date")
  private DateTime lengthdatedate = null;

  @SerializedName("closeddate$date")
  private DateTime closeddatedate = null;

  @SerializedName("closingwperiod_id")
  private String closingwperiodId = null;

  @SerializedName("entrystatus")
  private Integer entrystatus = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("closing_id")
  private String closingId = null;

  @SerializedName("feasthours")
  private Double feasthours = null;

  @SerializedName("nighthours")
  private Double nighthours = null;

  @SerializedName("envhours")
  private Double envhours = null;

  @SerializedName("wendhours")
  private Double wendhours = null;

  @SerializedName("deftypeastext")
  private String deftypeastext = null;

  @SerializedName("durationindays")
  private Double durationindays = null;

  @SerializedName("netdurationindays")
  private Double netdurationindays = null;

  @SerializedName("durationinhours")
  private Double durationinhours = null;

  @SerializedName("netdurationinhours")
  private Double netdurationinhours = null;

  @SerializedName("netlengthdate")
  private DateTime netlengthdate = null;

  public Wlworklog displayname(String displayname) {
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

  public Wlworklog id(String id) {
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

  public Wlworklog classid(String classid) {
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

  public Wlworklog objversion(Integer objversion) {
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

  public Wlworklog workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

   /**
   * pracovník; id objektu docházka - pracovníci [persistentní položka]
   * @return workerId
  **/
  @ApiModelProperty(example = "null", value = "pracovník; id objektu docházka - pracovníci [persistentní položka]")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public Wlworklog entrytypeId(String entrytypeId) {
    this.entrytypeId = entrytypeId;
    return this;
  }

   /**
   * typ záznamu; id objektu docházka - druh činnosti [persistentní položka]
   * @return entrytypeId
  **/
  @ApiModelProperty(example = "null", value = "typ záznamu; id objektu docházka - druh činnosti [persistentní položka]")
  public String getEntrytypeId() {
    return entrytypeId;
  }

  public void setEntrytypeId(String entrytypeId) {
    this.entrytypeId = entrytypeId;
  }

  public Wlworklog description(String description) {
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

  public Wlworklog basetype(Integer basetype) {
    this.basetype = basetype;
    return this;
  }

   /**
   * základní typ [persistentní položka]
   * @return basetype
  **/
  @ApiModelProperty(example = "null", value = "základní typ [persistentní položka]")
  public Integer getBasetype() {
    return basetype;
  }

  public void setBasetype(Integer basetype) {
    this.basetype = basetype;
  }

  public Wlworklog entryvalue(Double entryvalue) {
    this.entryvalue = entryvalue;
    return this;
  }

   /**
   * hodnota záznamu [persistentní položka]
   * @return entryvalue
  **/
  @ApiModelProperty(example = "null", value = "hodnota záznamu [persistentní položka]")
  public Double getEntryvalue() {
    return entryvalue;
  }

  public void setEntryvalue(Double entryvalue) {
    this.entryvalue = entryvalue;
  }

  public Wlworklog begindatedate(DateTime begindatedate) {
    this.begindatedate = begindatedate;
    return this;
  }

   /**
   * datum a čas počátku [persistentní položka]
   * @return begindatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas počátku [persistentní položka]")
  public DateTime getBegindatedate() {
    return begindatedate;
  }

  public void setBegindatedate(DateTime begindatedate) {
    this.begindatedate = begindatedate;
  }

  public Wlworklog enddatedate(DateTime enddatedate) {
    this.enddatedate = enddatedate;
    return this;
  }

   /**
   * datum a čas konce [persistentní položka]
   * @return enddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas konce [persistentní položka]")
  public DateTime getEnddatedate() {
    return enddatedate;
  }

  public void setEnddatedate(DateTime enddatedate) {
    this.enddatedate = enddatedate;
  }

  public Wlworklog lengthdatedate(DateTime lengthdatedate) {
    this.lengthdatedate = lengthdatedate;
    return this;
  }

   /**
   * datum a čas konce - délka
   * @return lengthdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas konce - délka")
  public DateTime getLengthdatedate() {
    return lengthdatedate;
  }

  public void setLengthdatedate(DateTime lengthdatedate) {
    this.lengthdatedate = lengthdatedate;
  }

  public Wlworklog closeddatedate(DateTime closeddatedate) {
    this.closeddatedate = closeddatedate;
    return this;
  }

   /**
   * datum uzavření [persistentní položka]
   * @return closeddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum uzavření [persistentní položka]")
  public DateTime getCloseddatedate() {
    return closeddatedate;
  }

  public void setCloseddatedate(DateTime closeddatedate) {
    this.closeddatedate = closeddatedate;
  }

  public Wlworklog closingwperiodId(String closingwperiodId) {
    this.closingwperiodId = closingwperiodId;
    return this;
  }

   /**
   * mzdové období uzavření; id objektu mzdové období [persistentní položka]
   * @return closingwperiodId
  **/
  @ApiModelProperty(example = "null", value = "mzdové období uzavření; id objektu mzdové období [persistentní položka]")
  public String getClosingwperiodId() {
    return closingwperiodId;
  }

  public void setClosingwperiodId(String closingwperiodId) {
    this.closingwperiodId = closingwperiodId;
  }

  public Wlworklog entrystatus(Integer entrystatus) {
    this.entrystatus = entrystatus;
    return this;
  }

   /**
   * status záznamu [persistentní položka]
   * @return entrystatus
  **/
  @ApiModelProperty(example = "null", value = "status záznamu [persistentní položka]")
  public Integer getEntrystatus() {
    return entrystatus;
  }

  public void setEntrystatus(Integer entrystatus) {
    this.entrystatus = entrystatus;
  }

  public Wlworklog divisionId(String divisionId) {
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

  public Wlworklog busorderId(String busorderId) {
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

  public Wlworklog bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obchodní případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obchodní případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Wlworklog busprojectId(String busprojectId) {
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

  public Wlworklog createdbyId(String createdbyId) {
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

  public Wlworklog correctedbyId(String correctedbyId) {
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

  public Wlworklog closingId(String closingId) {
    this.closingId = closingId;
    return this;
  }

   /**
   * uzávěrka; id objektu docházka - uzávěrka [persistentní položka]
   * @return closingId
  **/
  @ApiModelProperty(example = "null", value = "uzávěrka; id objektu docházka - uzávěrka [persistentní položka]")
  public String getClosingId() {
    return closingId;
  }

  public void setClosingId(String closingId) {
    this.closingId = closingId;
  }

  public Wlworklog feasthours(Double feasthours) {
    this.feasthours = feasthours;
    return this;
  }

   /**
   * hodiny ve svátek [persistentní položka]
   * @return feasthours
  **/
  @ApiModelProperty(example = "null", value = "hodiny ve svátek [persistentní položka]")
  public Double getFeasthours() {
    return feasthours;
  }

  public void setFeasthours(Double feasthours) {
    this.feasthours = feasthours;
  }

  public Wlworklog nighthours(Double nighthours) {
    this.nighthours = nighthours;
    return this;
  }

   /**
   * hodiny v noci [persistentní položka]
   * @return nighthours
  **/
  @ApiModelProperty(example = "null", value = "hodiny v noci [persistentní položka]")
  public Double getNighthours() {
    return nighthours;
  }

  public void setNighthours(Double nighthours) {
    this.nighthours = nighthours;
  }

  public Wlworklog envhours(Double envhours) {
    this.envhours = envhours;
    return this;
  }

   /**
   * hodiny ve st. prostředí [persistentní položka]
   * @return envhours
  **/
  @ApiModelProperty(example = "null", value = "hodiny ve st. prostředí [persistentní položka]")
  public Double getEnvhours() {
    return envhours;
  }

  public void setEnvhours(Double envhours) {
    this.envhours = envhours;
  }

  public Wlworklog wendhours(Double wendhours) {
    this.wendhours = wendhours;
    return this;
  }

   /**
   * hodiny o víkendu [persistentní položka]
   * @return wendhours
  **/
  @ApiModelProperty(example = "null", value = "hodiny o víkendu [persistentní položka]")
  public Double getWendhours() {
    return wendhours;
  }

  public void setWendhours(Double wendhours) {
    this.wendhours = wendhours;
  }

  public Wlworklog deftypeastext(String deftypeastext) {
    this.deftypeastext = deftypeastext;
    return this;
  }

   /**
   * status záznamu
   * @return deftypeastext
  **/
  @ApiModelProperty(example = "null", value = "status záznamu")
  public String getDeftypeastext() {
    return deftypeastext;
  }

  public void setDeftypeastext(String deftypeastext) {
    this.deftypeastext = deftypeastext;
  }

  public Wlworklog durationindays(Double durationindays) {
    this.durationindays = durationindays;
    return this;
  }

   /**
   * Čas ve dnech
   * @return durationindays
  **/
  @ApiModelProperty(example = "null", value = "Čas ve dnech")
  public Double getDurationindays() {
    return durationindays;
  }

  public void setDurationindays(Double durationindays) {
    this.durationindays = durationindays;
  }

  public Wlworklog netdurationindays(Double netdurationindays) {
    this.netdurationindays = netdurationindays;
    return this;
  }

   /**
   * Čistý čas ve dnech
   * @return netdurationindays
  **/
  @ApiModelProperty(example = "null", value = "Čistý čas ve dnech")
  public Double getNetdurationindays() {
    return netdurationindays;
  }

  public void setNetdurationindays(Double netdurationindays) {
    this.netdurationindays = netdurationindays;
  }

  public Wlworklog durationinhours(Double durationinhours) {
    this.durationinhours = durationinhours;
    return this;
  }

   /**
   * Čas v hodinách
   * @return durationinhours
  **/
  @ApiModelProperty(example = "null", value = "Čas v hodinách")
  public Double getDurationinhours() {
    return durationinhours;
  }

  public void setDurationinhours(Double durationinhours) {
    this.durationinhours = durationinhours;
  }

  public Wlworklog netdurationinhours(Double netdurationinhours) {
    this.netdurationinhours = netdurationinhours;
    return this;
  }

   /**
   * Čistý čas v hodinách
   * @return netdurationinhours
  **/
  @ApiModelProperty(example = "null", value = "Čistý čas v hodinách")
  public Double getNetdurationinhours() {
    return netdurationinhours;
  }

  public void setNetdurationinhours(Double netdurationinhours) {
    this.netdurationinhours = netdurationinhours;
  }

  public Wlworklog netlengthdate(DateTime netlengthdate) {
    this.netlengthdate = netlengthdate;
    return this;
  }

   /**
   * Čistý čas bez nepřítomností
   * @return netlengthdate
  **/
  @ApiModelProperty(example = "null", value = "Čistý čas bez nepřítomností")
  public DateTime getNetlengthdate() {
    return netlengthdate;
  }

  public void setNetlengthdate(DateTime netlengthdate) {
    this.netlengthdate = netlengthdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wlworklog wlworklog = (Wlworklog) o;
    return Objects.equals(this.displayname, wlworklog.displayname) &&
        Objects.equals(this.id, wlworklog.id) &&
        Objects.equals(this.classid, wlworklog.classid) &&
        Objects.equals(this.objversion, wlworklog.objversion) &&
        Objects.equals(this.workerId, wlworklog.workerId) &&
        Objects.equals(this.entrytypeId, wlworklog.entrytypeId) &&
        Objects.equals(this.description, wlworklog.description) &&
        Objects.equals(this.basetype, wlworklog.basetype) &&
        Objects.equals(this.entryvalue, wlworklog.entryvalue) &&
        Objects.equals(this.begindatedate, wlworklog.begindatedate) &&
        Objects.equals(this.enddatedate, wlworklog.enddatedate) &&
        Objects.equals(this.lengthdatedate, wlworklog.lengthdatedate) &&
        Objects.equals(this.closeddatedate, wlworklog.closeddatedate) &&
        Objects.equals(this.closingwperiodId, wlworklog.closingwperiodId) &&
        Objects.equals(this.entrystatus, wlworklog.entrystatus) &&
        Objects.equals(this.divisionId, wlworklog.divisionId) &&
        Objects.equals(this.busorderId, wlworklog.busorderId) &&
        Objects.equals(this.bustransactionId, wlworklog.bustransactionId) &&
        Objects.equals(this.busprojectId, wlworklog.busprojectId) &&
        Objects.equals(this.createdbyId, wlworklog.createdbyId) &&
        Objects.equals(this.correctedbyId, wlworklog.correctedbyId) &&
        Objects.equals(this.closingId, wlworklog.closingId) &&
        Objects.equals(this.feasthours, wlworklog.feasthours) &&
        Objects.equals(this.nighthours, wlworklog.nighthours) &&
        Objects.equals(this.envhours, wlworklog.envhours) &&
        Objects.equals(this.wendhours, wlworklog.wendhours) &&
        Objects.equals(this.deftypeastext, wlworklog.deftypeastext) &&
        Objects.equals(this.durationindays, wlworklog.durationindays) &&
        Objects.equals(this.netdurationindays, wlworklog.netdurationindays) &&
        Objects.equals(this.durationinhours, wlworklog.durationinhours) &&
        Objects.equals(this.netdurationinhours, wlworklog.netdurationinhours) &&
        Objects.equals(this.netlengthdate, wlworklog.netlengthdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, workerId, entrytypeId, description, basetype, entryvalue, begindatedate, enddatedate, lengthdatedate, closeddatedate, closingwperiodId, entrystatus, divisionId, busorderId, bustransactionId, busprojectId, createdbyId, correctedbyId, closingId, feasthours, nighthours, envhours, wendhours, deftypeastext, durationindays, netdurationindays, durationinhours, netdurationinhours, netlengthdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wlworklog {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    entrytypeId: ").append(toIndentedString(entrytypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    basetype: ").append(toIndentedString(basetype)).append("\n");
    sb.append("    entryvalue: ").append(toIndentedString(entryvalue)).append("\n");
    sb.append("    begindatedate: ").append(toIndentedString(begindatedate)).append("\n");
    sb.append("    enddatedate: ").append(toIndentedString(enddatedate)).append("\n");
    sb.append("    lengthdatedate: ").append(toIndentedString(lengthdatedate)).append("\n");
    sb.append("    closeddatedate: ").append(toIndentedString(closeddatedate)).append("\n");
    sb.append("    closingwperiodId: ").append(toIndentedString(closingwperiodId)).append("\n");
    sb.append("    entrystatus: ").append(toIndentedString(entrystatus)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    closingId: ").append(toIndentedString(closingId)).append("\n");
    sb.append("    feasthours: ").append(toIndentedString(feasthours)).append("\n");
    sb.append("    nighthours: ").append(toIndentedString(nighthours)).append("\n");
    sb.append("    envhours: ").append(toIndentedString(envhours)).append("\n");
    sb.append("    wendhours: ").append(toIndentedString(wendhours)).append("\n");
    sb.append("    deftypeastext: ").append(toIndentedString(deftypeastext)).append("\n");
    sb.append("    durationindays: ").append(toIndentedString(durationindays)).append("\n");
    sb.append("    netdurationindays: ").append(toIndentedString(netdurationindays)).append("\n");
    sb.append("    durationinhours: ").append(toIndentedString(durationinhours)).append("\n");
    sb.append("    netdurationinhours: ").append(toIndentedString(netdurationinhours)).append("\n");
    sb.append("    netlengthdate: ").append(toIndentedString(netlengthdate)).append("\n");
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

