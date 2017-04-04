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
 * Sickbenefit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Sickbenefit   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Sickbenefitrow> rows = new ArrayList<Sickbenefitrow>();

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

  @SerializedName("workingrelation_id")
  private String workingrelationId = null;

  @SerializedName("datefrom$date")
  private DateTime datefromdate = null;

  @SerializedName("dateto$date")
  private DateTime datetodate = null;

  @SerializedName("firstday")
  private Double firstday = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("sickbenefittype_id")
  private String sickbenefittypeId = null;

  @SerializedName("average")
  private Double average = null;

  @SerializedName("basesicktype")
  private Integer basesicktype = null;

  @SerializedName("onecase")
  private Boolean onecase = null;

  @SerializedName("isabsent")
  private Boolean isabsent = null;

  @SerializedName("maxdaycount")
  private Double maxdaycount = null;

  @SerializedName("totaldaycount")
  private Double totaldaycount = null;

  @SerializedName("averagetext")
  private String averagetext = null;

  @SerializedName("dirty")
  private Boolean dirty = null;

  @SerializedName("daybaserounding")
  private Integer daybaserounding = null;

  @SerializedName("sickbenefitrounding")
  private Integer sickbenefitrounding = null;

  @SerializedName("averagereduction")
  private Boolean averagereduction = null;

  @SerializedName("noexcludeddays")
  private Boolean noexcludeddays = null;

  @SerializedName("createdinclosedperiod")
  private Boolean createdinclosedperiod = null;

  @SerializedName("shortenedinclosedperiod")
  private Boolean shortenedinclosedperiod = null;

  @SerializedName("isunpaid")
  private Boolean isunpaid = null;

  @SerializedName("lastshiftdate$date")
  private DateTime lastshiftdatedate = null;

  @SerializedName("payworkingdays")
  private Boolean payworkingdays = null;

  @SerializedName("lastday")
  private Double lastday = null;

  @SerializedName("maxexcludeddays")
  private Double maxexcludeddays = null;

  @SerializedName("workinginjury_id")
  private String workinginjuryId = null;

  @SerializedName("decisionnumber")
  private String decisionnumber = null;

  @SerializedName("employee_id")
  private String employeeId = null;

  @SerializedName("pers_lastname")
  private String persLastname = null;

  @SerializedName("pers_personalnumber")
  private String persPersonalnumber = null;

  @SerializedName("basesicktypetext")
  private String basesicktypetext = null;

  @SerializedName("calendardayscount")
  private Double calendardayscount = null;

  @SerializedName("prevsickbenefit_id")
  private String prevsickbenefitId = null;

  @SerializedName("continuingsickbenefit")
  private Boolean continuingsickbenefit = null;

  @SerializedName("daybase1")
  private Double daybase1 = null;

  @SerializedName("daybase2")
  private Double daybase2 = null;

  @SerializedName("hourbase")
  private Double hourbase = null;

  @SerializedName("firstdatefrom")
  private Double firstdatefrom = null;

  @SerializedName("fulldisplayname")
  private String fulldisplayname = null;

  public Sickbenefit displayname(String displayname) {
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

  public Sickbenefit id(String id) {
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

  public Sickbenefit classid(String classid) {
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

  public Sickbenefit objversion(Integer objversion) {
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

  public Sickbenefit rows(List<Sickbenefitrow> rows) {
    this.rows = rows;
    return this;
  }

  public Sickbenefit addRowsItem(Sickbenefitrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo Řádek nd [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo Řádek nd [nepersistentní položka]")
  public List<Sickbenefitrow> getRows() {
    return rows;
  }

  public void setRows(List<Sickbenefitrow> rows) {
    this.rows = rows;
  }

  public Sickbenefit docqueueId(String docqueueId) {
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

  public Sickbenefit periodId(String periodId) {
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

  public Sickbenefit ordnumber(Integer ordnumber) {
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

  public Sickbenefit docdatedate(DateTime docdatedate) {
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

  public Sickbenefit createdbyId(String createdbyId) {
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

  public Sickbenefit correctedbyId(String correctedbyId) {
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

  public Sickbenefit newrelatedtype(Integer newrelatedtype) {
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

  public Sickbenefit newrelateddocumentId(String newrelateddocumentId) {
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

  public Sickbenefit workingrelationId(String workingrelationId) {
    this.workingrelationId = workingrelationId;
    return this;
  }

   /**
   * pracovní poměr; id objektu pracovní poměr [persistentní položka]
   * @return workingrelationId
  **/
  @ApiModelProperty(example = "null", value = "pracovní poměr; id objektu pracovní poměr [persistentní položka]")
  public String getWorkingrelationId() {
    return workingrelationId;
  }

  public void setWorkingrelationId(String workingrelationId) {
    this.workingrelationId = workingrelationId;
  }

  public Sickbenefit datefromdate(DateTime datefromdate) {
    this.datefromdate = datefromdate;
    return this;
  }

   /**
   * dávka od [persistentní položka]
   * @return datefromdate
  **/
  @ApiModelProperty(example = "null", value = "dávka od [persistentní položka]")
  public DateTime getDatefromdate() {
    return datefromdate;
  }

  public void setDatefromdate(DateTime datefromdate) {
    this.datefromdate = datefromdate;
  }

  public Sickbenefit datetodate(DateTime datetodate) {
    this.datetodate = datetodate;
    return this;
  }

   /**
   * dávka do [persistentní položka]
   * @return datetodate
  **/
  @ApiModelProperty(example = "null", value = "dávka do [persistentní položka]")
  public DateTime getDatetodate() {
    return datetodate;
  }

  public void setDatetodate(DateTime datetodate) {
    this.datetodate = datetodate;
  }

  public Sickbenefit firstday(Double firstday) {
    this.firstday = firstday;
    return this;
  }

   /**
   * 1.den [persistentní položka]
   * @return firstday
  **/
  @ApiModelProperty(example = "null", value = "1.den [persistentní položka]")
  public Double getFirstday() {
    return firstday;
  }

  public void setFirstday(Double firstday) {
    this.firstday = firstday;
  }

  public Sickbenefit description(String description) {
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

  public Sickbenefit sickbenefittypeId(String sickbenefittypeId) {
    this.sickbenefittypeId = sickbenefittypeId;
    return this;
  }

   /**
   * druh nd; id objektu druh nemocenské dávky [persistentní položka]
   * @return sickbenefittypeId
  **/
  @ApiModelProperty(example = "null", value = "druh nd; id objektu druh nemocenské dávky [persistentní položka]")
  public String getSickbenefittypeId() {
    return sickbenefittypeId;
  }

  public void setSickbenefittypeId(String sickbenefittypeId) {
    this.sickbenefittypeId = sickbenefittypeId;
  }

  public Sickbenefit average(Double average) {
    this.average = average;
    return this;
  }

   /**
   * průměr [persistentní položka]
   * @return average
  **/
  @ApiModelProperty(example = "null", value = "průměr [persistentní položka]")
  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public Sickbenefit basesicktype(Integer basesicktype) {
    this.basesicktype = basesicktype;
    return this;
  }

   /**
   * základní typ [persistentní položka]
   * @return basesicktype
  **/
  @ApiModelProperty(example = "null", value = "základní typ [persistentní položka]")
  public Integer getBasesicktype() {
    return basesicktype;
  }

  public void setBasesicktype(Integer basesicktype) {
    this.basesicktype = basesicktype;
  }

  public Sickbenefit onecase(Boolean onecase) {
    this.onecase = onecase;
    return this;
  }

   /**
   * jednorázově [persistentní položka]
   * @return onecase
  **/
  @ApiModelProperty(example = "null", value = "jednorázově [persistentní položka]")
  public Boolean getOnecase() {
    return onecase;
  }

  public void setOnecase(Boolean onecase) {
    this.onecase = onecase;
  }

  public Sickbenefit isabsent(Boolean isabsent) {
    this.isabsent = isabsent;
    return this;
  }

   /**
   * nepřítomnost [persistentní položka]
   * @return isabsent
  **/
  @ApiModelProperty(example = "null", value = "nepřítomnost [persistentní položka]")
  public Boolean getIsabsent() {
    return isabsent;
  }

  public void setIsabsent(Boolean isabsent) {
    this.isabsent = isabsent;
  }

  public Sickbenefit maxdaycount(Double maxdaycount) {
    this.maxdaycount = maxdaycount;
    return this;
  }

   /**
   * max. dní [persistentní položka]
   * @return maxdaycount
  **/
  @ApiModelProperty(example = "null", value = "max. dní [persistentní položka]")
  public Double getMaxdaycount() {
    return maxdaycount;
  }

  public void setMaxdaycount(Double maxdaycount) {
    this.maxdaycount = maxdaycount;
  }

  public Sickbenefit totaldaycount(Double totaldaycount) {
    this.totaldaycount = totaldaycount;
    return this;
  }

   /**
   * celkem dní [persistentní položka]
   * @return totaldaycount
  **/
  @ApiModelProperty(example = "null", value = "celkem dní [persistentní položka]")
  public Double getTotaldaycount() {
    return totaldaycount;
  }

  public void setTotaldaycount(Double totaldaycount) {
    this.totaldaycount = totaldaycount;
  }

  public Sickbenefit averagetext(String averagetext) {
    this.averagetext = averagetext;
    return this;
  }

   /**
   * popis průměru [persistentní položka]
   * @return averagetext
  **/
  @ApiModelProperty(example = "null", value = "popis průměru [persistentní položka]")
  public String getAveragetext() {
    return averagetext;
  }

  public void setAveragetext(String averagetext) {
    this.averagetext = averagetext;
  }

  public Sickbenefit dirty(Boolean dirty) {
    this.dirty = dirty;
    return this;
  }

   /**
   * nepočítaný objekt [persistentní položka]
   * @return dirty
  **/
  @ApiModelProperty(example = "null", value = "nepočítaný objekt [persistentní položka]")
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
    this.dirty = dirty;
  }

  public Sickbenefit daybaserounding(Integer daybaserounding) {
    this.daybaserounding = daybaserounding;
    return this;
  }

   /**
   * zaokr. den. vym. zákl. [persistentní položka]
   * @return daybaserounding
  **/
  @ApiModelProperty(example = "null", value = "zaokr. den. vym. zákl. [persistentní položka]")
  public Integer getDaybaserounding() {
    return daybaserounding;
  }

  public void setDaybaserounding(Integer daybaserounding) {
    this.daybaserounding = daybaserounding;
  }

  public Sickbenefit sickbenefitrounding(Integer sickbenefitrounding) {
    this.sickbenefitrounding = sickbenefitrounding;
    return this;
  }

   /**
   * zaokr. nem. dávky [persistentní položka]
   * @return sickbenefitrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokr. nem. dávky [persistentní položka]")
  public Integer getSickbenefitrounding() {
    return sickbenefitrounding;
  }

  public void setSickbenefitrounding(Integer sickbenefitrounding) {
    this.sickbenefitrounding = sickbenefitrounding;
  }

  public Sickbenefit averagereduction(Boolean averagereduction) {
    this.averagereduction = averagereduction;
    return this;
  }

   /**
   * redukce dvz [persistentní položka]
   * @return averagereduction
  **/
  @ApiModelProperty(example = "null", value = "redukce dvz [persistentní položka]")
  public Boolean getAveragereduction() {
    return averagereduction;
  }

  public void setAveragereduction(Boolean averagereduction) {
    this.averagereduction = averagereduction;
  }

  public Sickbenefit noexcludeddays(Boolean noexcludeddays) {
    this.noexcludeddays = noexcludeddays;
    return this;
  }

   /**
   * není vyl.doba [persistentní položka]
   * @return noexcludeddays
  **/
  @ApiModelProperty(example = "null", value = "není vyl.doba [persistentní položka]")
  public Boolean getNoexcludeddays() {
    return noexcludeddays;
  }

  public void setNoexcludeddays(Boolean noexcludeddays) {
    this.noexcludeddays = noexcludeddays;
  }

  public Sickbenefit createdinclosedperiod(Boolean createdinclosedperiod) {
    this.createdinclosedperiod = createdinclosedperiod;
    return this;
  }

   /**
   * vytvořeno v uzavřeném období [persistentní položka]
   * @return createdinclosedperiod
  **/
  @ApiModelProperty(example = "null", value = "vytvořeno v uzavřeném období [persistentní položka]")
  public Boolean getCreatedinclosedperiod() {
    return createdinclosedperiod;
  }

  public void setCreatedinclosedperiod(Boolean createdinclosedperiod) {
    this.createdinclosedperiod = createdinclosedperiod;
  }

  public Sickbenefit shortenedinclosedperiod(Boolean shortenedinclosedperiod) {
    this.shortenedinclosedperiod = shortenedinclosedperiod;
    return this;
  }

   /**
   * ukončeno v uzavřeném období [persistentní položka]
   * @return shortenedinclosedperiod
  **/
  @ApiModelProperty(example = "null", value = "ukončeno v uzavřeném období [persistentní položka]")
  public Boolean getShortenedinclosedperiod() {
    return shortenedinclosedperiod;
  }

  public void setShortenedinclosedperiod(Boolean shortenedinclosedperiod) {
    this.shortenedinclosedperiod = shortenedinclosedperiod;
  }

  public Sickbenefit isunpaid(Boolean isunpaid) {
    this.isunpaid = isunpaid;
    return this;
  }

   /**
   * neproplácí se [persistentní položka]
   * @return isunpaid
  **/
  @ApiModelProperty(example = "null", value = "neproplácí se [persistentní položka]")
  public Boolean getIsunpaid() {
    return isunpaid;
  }

  public void setIsunpaid(Boolean isunpaid) {
    this.isunpaid = isunpaid;
  }

  public Sickbenefit lastshiftdatedate(DateTime lastshiftdatedate) {
    this.lastshiftdatedate = lastshiftdatedate;
    return this;
  }

   /**
   * posl. prac. den zam. [persistentní položka]
   * @return lastshiftdatedate
  **/
  @ApiModelProperty(example = "null", value = "posl. prac. den zam. [persistentní položka]")
  public DateTime getLastshiftdatedate() {
    return lastshiftdatedate;
  }

  public void setLastshiftdatedate(DateTime lastshiftdatedate) {
    this.lastshiftdatedate = lastshiftdatedate;
  }

  public Sickbenefit payworkingdays(Boolean payworkingdays) {
    this.payworkingdays = payworkingdays;
    return this;
  }

   /**
   * proplácet pracovní dny [persistentní položka]
   * @return payworkingdays
  **/
  @ApiModelProperty(example = "null", value = "proplácet pracovní dny [persistentní položka]")
  public Boolean getPayworkingdays() {
    return payworkingdays;
  }

  public void setPayworkingdays(Boolean payworkingdays) {
    this.payworkingdays = payworkingdays;
  }

  public Sickbenefit lastday(Double lastday) {
    this.lastday = lastday;
    return this;
  }

   /**
   * posl.den [persistentní položka]
   * @return lastday
  **/
  @ApiModelProperty(example = "null", value = "posl.den [persistentní položka]")
  public Double getLastday() {
    return lastday;
  }

  public void setLastday(Double lastday) {
    this.lastday = lastday;
  }

  public Sickbenefit maxexcludeddays(Double maxexcludeddays) {
    this.maxexcludeddays = maxexcludeddays;
    return this;
  }

   /**
   * max. počet. vyl. dní [persistentní položka]
   * @return maxexcludeddays
  **/
  @ApiModelProperty(example = "null", value = "max. počet. vyl. dní [persistentní položka]")
  public Double getMaxexcludeddays() {
    return maxexcludeddays;
  }

  public void setMaxexcludeddays(Double maxexcludeddays) {
    this.maxexcludeddays = maxexcludeddays;
  }

  public Sickbenefit workinginjuryId(String workinginjuryId) {
    this.workinginjuryId = workinginjuryId;
    return this;
  }

   /**
   * pracovní úraz; id objektu pracovní úraz [persistentní položka]
   * @return workinginjuryId
  **/
  @ApiModelProperty(example = "null", value = "pracovní úraz; id objektu pracovní úraz [persistentní položka]")
  public String getWorkinginjuryId() {
    return workinginjuryId;
  }

  public void setWorkinginjuryId(String workinginjuryId) {
    this.workinginjuryId = workinginjuryId;
  }

  public Sickbenefit decisionnumber(String decisionnumber) {
    this.decisionnumber = decisionnumber;
    return this;
  }

   /**
   * Číslo potvrzení [persistentní položka]
   * @return decisionnumber
  **/
  @ApiModelProperty(example = "null", value = "Číslo potvrzení [persistentní položka]")
  public String getDecisionnumber() {
    return decisionnumber;
  }

  public void setDecisionnumber(String decisionnumber) {
    this.decisionnumber = decisionnumber;
  }

  public Sickbenefit employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * zaměstnanec; id objektu zaměstnanec
   * @return employeeId
  **/
  @ApiModelProperty(example = "null", value = "zaměstnanec; id objektu zaměstnanec")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Sickbenefit persLastname(String persLastname) {
    this.persLastname = persLastname;
    return this;
  }

   /**
   * příjmení
   * @return persLastname
  **/
  @ApiModelProperty(example = "null", value = "příjmení")
  public String getPersLastname() {
    return persLastname;
  }

  public void setPersLastname(String persLastname) {
    this.persLastname = persLastname;
  }

  public Sickbenefit persPersonalnumber(String persPersonalnumber) {
    this.persPersonalnumber = persPersonalnumber;
    return this;
  }

   /**
   * os.číslo
   * @return persPersonalnumber
  **/
  @ApiModelProperty(example = "null", value = "os.číslo")
  public String getPersPersonalnumber() {
    return persPersonalnumber;
  }

  public void setPersPersonalnumber(String persPersonalnumber) {
    this.persPersonalnumber = persPersonalnumber;
  }

  public Sickbenefit basesicktypetext(String basesicktypetext) {
    this.basesicktypetext = basesicktypetext;
    return this;
  }

   /**
   * základní typ
   * @return basesicktypetext
  **/
  @ApiModelProperty(example = "null", value = "základní typ")
  public String getBasesicktypetext() {
    return basesicktypetext;
  }

  public void setBasesicktypetext(String basesicktypetext) {
    this.basesicktypetext = basesicktypetext;
  }

  public Sickbenefit calendardayscount(Double calendardayscount) {
    this.calendardayscount = calendardayscount;
    return this;
  }

   /**
   * kalendářní dny
   * @return calendardayscount
  **/
  @ApiModelProperty(example = "null", value = "kalendářní dny")
  public Double getCalendardayscount() {
    return calendardayscount;
  }

  public void setCalendardayscount(Double calendardayscount) {
    this.calendardayscount = calendardayscount;
  }

  public Sickbenefit prevsickbenefitId(String prevsickbenefitId) {
    this.prevsickbenefitId = prevsickbenefitId;
    return this;
  }

   /**
   * předchozí nd; id objektu nemocenská dávka [persistentní položka]
   * @return prevsickbenefitId
  **/
  @ApiModelProperty(example = "null", value = "předchozí nd; id objektu nemocenská dávka [persistentní položka]")
  public String getPrevsickbenefitId() {
    return prevsickbenefitId;
  }

  public void setPrevsickbenefitId(String prevsickbenefitId) {
    this.prevsickbenefitId = prevsickbenefitId;
  }

  public Sickbenefit continuingsickbenefit(Boolean continuingsickbenefit) {
    this.continuingsickbenefit = continuingsickbenefit;
    return this;
  }

   /**
   * pokračující nd [persistentní položka]
   * @return continuingsickbenefit
  **/
  @ApiModelProperty(example = "null", value = "pokračující nd [persistentní položka]")
  public Boolean getContinuingsickbenefit() {
    return continuingsickbenefit;
  }

  public void setContinuingsickbenefit(Boolean continuingsickbenefit) {
    this.continuingsickbenefit = continuingsickbenefit;
  }

  public Sickbenefit daybase1(Double daybase1) {
    this.daybase1 = daybase1;
    return this;
  }

   /**
   * dvz1
   * @return daybase1
  **/
  @ApiModelProperty(example = "null", value = "dvz1")
  public Double getDaybase1() {
    return daybase1;
  }

  public void setDaybase1(Double daybase1) {
    this.daybase1 = daybase1;
  }

  public Sickbenefit daybase2(Double daybase2) {
    this.daybase2 = daybase2;
    return this;
  }

   /**
   * dvz2
   * @return daybase2
  **/
  @ApiModelProperty(example = "null", value = "dvz2")
  public Double getDaybase2() {
    return daybase2;
  }

  public void setDaybase2(Double daybase2) {
    this.daybase2 = daybase2;
  }

  public Sickbenefit hourbase(Double hourbase) {
    this.hourbase = hourbase;
    return this;
  }

   /**
   * rpv
   * @return hourbase
  **/
  @ApiModelProperty(example = "null", value = "rpv")
  public Double getHourbase() {
    return hourbase;
  }

  public void setHourbase(Double hourbase) {
    this.hourbase = hourbase;
  }

  public Sickbenefit firstdatefrom(Double firstdatefrom) {
    this.firstdatefrom = firstdatefrom;
    return this;
  }

   /**
   * datum od - pokračující nd
   * @return firstdatefrom
  **/
  @ApiModelProperty(example = "null", value = "datum od - pokračující nd")
  public Double getFirstdatefrom() {
    return firstdatefrom;
  }

  public void setFirstdatefrom(Double firstdatefrom) {
    this.firstdatefrom = firstdatefrom;
  }

  public Sickbenefit fulldisplayname(String fulldisplayname) {
    this.fulldisplayname = fulldisplayname;
    return this;
  }

   /**
   * plné jméno
   * @return fulldisplayname
  **/
  @ApiModelProperty(example = "null", value = "plné jméno")
  public String getFulldisplayname() {
    return fulldisplayname;
  }

  public void setFulldisplayname(String fulldisplayname) {
    this.fulldisplayname = fulldisplayname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sickbenefit sickbenefit = (Sickbenefit) o;
    return Objects.equals(this.displayname, sickbenefit.displayname) &&
        Objects.equals(this.id, sickbenefit.id) &&
        Objects.equals(this.classid, sickbenefit.classid) &&
        Objects.equals(this.objversion, sickbenefit.objversion) &&
        Objects.equals(this.rows, sickbenefit.rows) &&
        Objects.equals(this.docqueueId, sickbenefit.docqueueId) &&
        Objects.equals(this.periodId, sickbenefit.periodId) &&
        Objects.equals(this.ordnumber, sickbenefit.ordnumber) &&
        Objects.equals(this.docdatedate, sickbenefit.docdatedate) &&
        Objects.equals(this.createdbyId, sickbenefit.createdbyId) &&
        Objects.equals(this.correctedbyId, sickbenefit.correctedbyId) &&
        Objects.equals(this.newrelatedtype, sickbenefit.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, sickbenefit.newrelateddocumentId) &&
        Objects.equals(this.workingrelationId, sickbenefit.workingrelationId) &&
        Objects.equals(this.datefromdate, sickbenefit.datefromdate) &&
        Objects.equals(this.datetodate, sickbenefit.datetodate) &&
        Objects.equals(this.firstday, sickbenefit.firstday) &&
        Objects.equals(this.description, sickbenefit.description) &&
        Objects.equals(this.sickbenefittypeId, sickbenefit.sickbenefittypeId) &&
        Objects.equals(this.average, sickbenefit.average) &&
        Objects.equals(this.basesicktype, sickbenefit.basesicktype) &&
        Objects.equals(this.onecase, sickbenefit.onecase) &&
        Objects.equals(this.isabsent, sickbenefit.isabsent) &&
        Objects.equals(this.maxdaycount, sickbenefit.maxdaycount) &&
        Objects.equals(this.totaldaycount, sickbenefit.totaldaycount) &&
        Objects.equals(this.averagetext, sickbenefit.averagetext) &&
        Objects.equals(this.dirty, sickbenefit.dirty) &&
        Objects.equals(this.daybaserounding, sickbenefit.daybaserounding) &&
        Objects.equals(this.sickbenefitrounding, sickbenefit.sickbenefitrounding) &&
        Objects.equals(this.averagereduction, sickbenefit.averagereduction) &&
        Objects.equals(this.noexcludeddays, sickbenefit.noexcludeddays) &&
        Objects.equals(this.createdinclosedperiod, sickbenefit.createdinclosedperiod) &&
        Objects.equals(this.shortenedinclosedperiod, sickbenefit.shortenedinclosedperiod) &&
        Objects.equals(this.isunpaid, sickbenefit.isunpaid) &&
        Objects.equals(this.lastshiftdatedate, sickbenefit.lastshiftdatedate) &&
        Objects.equals(this.payworkingdays, sickbenefit.payworkingdays) &&
        Objects.equals(this.lastday, sickbenefit.lastday) &&
        Objects.equals(this.maxexcludeddays, sickbenefit.maxexcludeddays) &&
        Objects.equals(this.workinginjuryId, sickbenefit.workinginjuryId) &&
        Objects.equals(this.decisionnumber, sickbenefit.decisionnumber) &&
        Objects.equals(this.employeeId, sickbenefit.employeeId) &&
        Objects.equals(this.persLastname, sickbenefit.persLastname) &&
        Objects.equals(this.persPersonalnumber, sickbenefit.persPersonalnumber) &&
        Objects.equals(this.basesicktypetext, sickbenefit.basesicktypetext) &&
        Objects.equals(this.calendardayscount, sickbenefit.calendardayscount) &&
        Objects.equals(this.prevsickbenefitId, sickbenefit.prevsickbenefitId) &&
        Objects.equals(this.continuingsickbenefit, sickbenefit.continuingsickbenefit) &&
        Objects.equals(this.daybase1, sickbenefit.daybase1) &&
        Objects.equals(this.daybase2, sickbenefit.daybase2) &&
        Objects.equals(this.hourbase, sickbenefit.hourbase) &&
        Objects.equals(this.firstdatefrom, sickbenefit.firstdatefrom) &&
        Objects.equals(this.fulldisplayname, sickbenefit.fulldisplayname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, workingrelationId, datefromdate, datetodate, firstday, description, sickbenefittypeId, average, basesicktype, onecase, isabsent, maxdaycount, totaldaycount, averagetext, dirty, daybaserounding, sickbenefitrounding, averagereduction, noexcludeddays, createdinclosedperiod, shortenedinclosedperiod, isunpaid, lastshiftdatedate, payworkingdays, lastday, maxexcludeddays, workinginjuryId, decisionnumber, employeeId, persLastname, persPersonalnumber, basesicktypetext, calendardayscount, prevsickbenefitId, continuingsickbenefit, daybase1, daybase2, hourbase, firstdatefrom, fulldisplayname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sickbenefit {\n");
    
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
    sb.append("    workingrelationId: ").append(toIndentedString(workingrelationId)).append("\n");
    sb.append("    datefromdate: ").append(toIndentedString(datefromdate)).append("\n");
    sb.append("    datetodate: ").append(toIndentedString(datetodate)).append("\n");
    sb.append("    firstday: ").append(toIndentedString(firstday)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sickbenefittypeId: ").append(toIndentedString(sickbenefittypeId)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    basesicktype: ").append(toIndentedString(basesicktype)).append("\n");
    sb.append("    onecase: ").append(toIndentedString(onecase)).append("\n");
    sb.append("    isabsent: ").append(toIndentedString(isabsent)).append("\n");
    sb.append("    maxdaycount: ").append(toIndentedString(maxdaycount)).append("\n");
    sb.append("    totaldaycount: ").append(toIndentedString(totaldaycount)).append("\n");
    sb.append("    averagetext: ").append(toIndentedString(averagetext)).append("\n");
    sb.append("    dirty: ").append(toIndentedString(dirty)).append("\n");
    sb.append("    daybaserounding: ").append(toIndentedString(daybaserounding)).append("\n");
    sb.append("    sickbenefitrounding: ").append(toIndentedString(sickbenefitrounding)).append("\n");
    sb.append("    averagereduction: ").append(toIndentedString(averagereduction)).append("\n");
    sb.append("    noexcludeddays: ").append(toIndentedString(noexcludeddays)).append("\n");
    sb.append("    createdinclosedperiod: ").append(toIndentedString(createdinclosedperiod)).append("\n");
    sb.append("    shortenedinclosedperiod: ").append(toIndentedString(shortenedinclosedperiod)).append("\n");
    sb.append("    isunpaid: ").append(toIndentedString(isunpaid)).append("\n");
    sb.append("    lastshiftdatedate: ").append(toIndentedString(lastshiftdatedate)).append("\n");
    sb.append("    payworkingdays: ").append(toIndentedString(payworkingdays)).append("\n");
    sb.append("    lastday: ").append(toIndentedString(lastday)).append("\n");
    sb.append("    maxexcludeddays: ").append(toIndentedString(maxexcludeddays)).append("\n");
    sb.append("    workinginjuryId: ").append(toIndentedString(workinginjuryId)).append("\n");
    sb.append("    decisionnumber: ").append(toIndentedString(decisionnumber)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    persLastname: ").append(toIndentedString(persLastname)).append("\n");
    sb.append("    persPersonalnumber: ").append(toIndentedString(persPersonalnumber)).append("\n");
    sb.append("    basesicktypetext: ").append(toIndentedString(basesicktypetext)).append("\n");
    sb.append("    calendardayscount: ").append(toIndentedString(calendardayscount)).append("\n");
    sb.append("    prevsickbenefitId: ").append(toIndentedString(prevsickbenefitId)).append("\n");
    sb.append("    continuingsickbenefit: ").append(toIndentedString(continuingsickbenefit)).append("\n");
    sb.append("    daybase1: ").append(toIndentedString(daybase1)).append("\n");
    sb.append("    daybase2: ").append(toIndentedString(daybase2)).append("\n");
    sb.append("    hourbase: ").append(toIndentedString(hourbase)).append("\n");
    sb.append("    firstdatefrom: ").append(toIndentedString(firstdatefrom)).append("\n");
    sb.append("    fulldisplayname: ").append(toIndentedString(fulldisplayname)).append("\n");
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
