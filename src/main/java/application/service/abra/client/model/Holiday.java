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
 * Holiday
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Holiday   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Holidayrow> rows = new ArrayList<Holidayrow>();

  @SerializedName("goon")
  private Boolean goon = null;

  @SerializedName("claimshorten")
  private Double claimshorten = null;

  @SerializedName("workingrelation_id")
  private String workingrelationId = null;

  @SerializedName("holiday_id")
  private String holidayId = null;

  @SerializedName("calendaryear")
  private Integer calendaryear = null;

  @SerializedName("regular")
  private Boolean regular = null;

  @SerializedName("claim")
  private Double claim = null;

  @SerializedName("resttransfer")
  private Double resttransfer = null;

  @SerializedName("validfrom$date")
  private DateTime validfromdate2 = null;

  @SerializedName("validto$date")
  private DateTime validtodate2 = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("payable")
  private Boolean payable = null;

  @SerializedName("drawdown")
  private Double drawdown = null;

  @SerializedName("previousrest")
  private Double previousrest = null;

  @SerializedName("claimshortencorr")
  private Double claimshortencorr = null;

  @SerializedName("claimshortencomp")
  private Double claimshortencomp = null;

  @SerializedName("transferwholerest")
  private Boolean transferwholerest = null;

  @SerializedName("validfrommonthday")
  private Integer validfrommonthday = null;

  @SerializedName("validtomonthday")
  private Integer validtomonthday = null;

  @SerializedName("validfrommonth")
  private Integer validfrommonth = null;

  @SerializedName("validfromday")
  private Integer validfromday = null;

  @SerializedName("validfromdate")
  private String validfromdate = null;

  @SerializedName("validtomonth")
  private Integer validtomonth = null;

  @SerializedName("validtoday")
  private Integer validtoday = null;

  @SerializedName("validtodate")
  private String validtodate = null;

  @SerializedName("employee_id")
  private String employeeId = null;

  @SerializedName("employeename")
  private String employeename = null;

  @SerializedName("pers_personalnumber")
  private String persPersonalnumber = null;

  @SerializedName("claimtype")
  private Integer claimtype = null;

  public Holiday displayname(String displayname) {
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

  public Holiday id(String id) {
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

  public Holiday classid(String classid) {
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

  public Holiday objversion(Integer objversion) {
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

  public Holiday rows(List<Holidayrow> rows) {
    this.rows = rows;
    return this;
  }

  public Holiday addRowsItem(Holidayrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Čerpání; kolekce bo Čerpaná dovolená [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Čerpání; kolekce bo Čerpaná dovolená [nepersistentní položka]")
  public List<Holidayrow> getRows() {
    return rows;
  }

  public void setRows(List<Holidayrow> rows) {
    this.rows = rows;
  }

  public Holiday goon(Boolean goon) {
    this.goon = goon;
    return this;
  }

   /**
   * vytv. v dalším roce [persistentní položka]
   * @return goon
  **/
  @ApiModelProperty(example = "null", value = "vytv. v dalším roce [persistentní položka]")
  public Boolean getGoon() {
    return goon;
  }

  public void setGoon(Boolean goon) {
    this.goon = goon;
  }

  public Holiday claimshorten(Double claimshorten) {
    this.claimshorten = claimshorten;
    return this;
  }

   /**
   * krác. nár. [persistentní položka]
   * @return claimshorten
  **/
  @ApiModelProperty(example = "null", value = "krác. nár. [persistentní položka]")
  public Double getClaimshorten() {
    return claimshorten;
  }

  public void setClaimshorten(Double claimshorten) {
    this.claimshorten = claimshorten;
  }

  public Holiday workingrelationId(String workingrelationId) {
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

  public Holiday holidayId(String holidayId) {
    this.holidayId = holidayId;
    return this;
  }

   /**
   * druh dov.; id objektu druh dovolené [persistentní položka]
   * @return holidayId
  **/
  @ApiModelProperty(example = "null", value = "druh dov.; id objektu druh dovolené [persistentní položka]")
  public String getHolidayId() {
    return holidayId;
  }

  public void setHolidayId(String holidayId) {
    this.holidayId = holidayId;
  }

  public Holiday calendaryear(Integer calendaryear) {
    this.calendaryear = calendaryear;
    return this;
  }

   /**
   * kalen. rok [persistentní položka]
   * @return calendaryear
  **/
  @ApiModelProperty(example = "null", value = "kalen. rok [persistentní položka]")
  public Integer getCalendaryear() {
    return calendaryear;
  }

  public void setCalendaryear(Integer calendaryear) {
    this.calendaryear = calendaryear;
  }

  public Holiday regular(Boolean regular) {
    this.regular = regular;
    return this;
  }

   /**
   * Řádná [persistentní položka]
   * @return regular
  **/
  @ApiModelProperty(example = "null", value = "Řádná [persistentní položka]")
  public Boolean getRegular() {
    return regular;
  }

  public void setRegular(Boolean regular) {
    this.regular = regular;
  }

  public Holiday claim(Double claim) {
    this.claim = claim;
    return this;
  }

   /**
   * nárok [persistentní položka]
   * @return claim
  **/
  @ApiModelProperty(example = "null", value = "nárok [persistentní položka]")
  public Double getClaim() {
    return claim;
  }

  public void setClaim(Double claim) {
    this.claim = claim;
  }

  public Holiday resttransfer(Double resttransfer) {
    this.resttransfer = resttransfer;
    return this;
  }

   /**
   * přenos. dní [persistentní položka]
   * @return resttransfer
  **/
  @ApiModelProperty(example = "null", value = "přenos. dní [persistentní položka]")
  public Double getResttransfer() {
    return resttransfer;
  }

  public void setResttransfer(Double resttransfer) {
    this.resttransfer = resttransfer;
  }

  public Holiday validfromdate2(DateTime validfromdate) {
    this.validfromdate2 = validfromdate2;
    return this;
  }

   /**
   * platí od [persistentní položka]
   * @return validfromdate
  **/
  @ApiModelProperty(example = "null", value = "platí od [persistentní položka]")
  public DateTime getValidfromdate2() {
    return validfromdate2;
  }

  public void setValidfromdate2(DateTime validfromdate) {
    this.validfromdate2 = validfromdate;
  }

  public Holiday validtodate2(DateTime validtodate) {
    this.validtodate2 = validtodate2;
    return this;
  }

   /**
   * platí do [persistentní položka]
   * @return validtodate
  **/
  @ApiModelProperty(example = "null", value = "platí do [persistentní položka]")
  public DateTime getValidtodate2() {
    return validtodate2;
  }

  public void setValidtodate(DateTime validtodate) {
    this.validtodate2 = validtodate2;
  }

  public Holiday code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Holiday name(String name) {
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

  public Holiday priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * priorita [persistentní položka]
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "priorita [persistentní položka]")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Holiday payable(Boolean payable) {
    this.payable = payable;
    return this;
  }

   /**
   * proplácet [persistentní položka]
   * @return payable
  **/
  @ApiModelProperty(example = "null", value = "proplácet [persistentní položka]")
  public Boolean getPayable() {
    return payable;
  }

  public void setPayable(Boolean payable) {
    this.payable = payable;
  }

  public Holiday drawdown(Double drawdown) {
    this.drawdown = drawdown;
    return this;
  }

   /**
   * cel. čerpáno [persistentní položka]
   * @return drawdown
  **/
  @ApiModelProperty(example = "null", value = "cel. čerpáno [persistentní položka]")
  public Double getDrawdown() {
    return drawdown;
  }

  public void setDrawdown(Double drawdown) {
    this.drawdown = drawdown;
  }

  public Holiday previousrest(Double previousrest) {
    this.previousrest = previousrest;
    return this;
  }

   /**
   * stará dov. [persistentní položka]
   * @return previousrest
  **/
  @ApiModelProperty(example = "null", value = "stará dov. [persistentní položka]")
  public Double getPreviousrest() {
    return previousrest;
  }

  public void setPreviousrest(Double previousrest) {
    this.previousrest = previousrest;
  }

  public Holiday claimshortencorr(Double claimshortencorr) {
    this.claimshortencorr = claimshortencorr;
    return this;
  }

   /**
   * oprava krácení [persistentní položka]
   * @return claimshortencorr
  **/
  @ApiModelProperty(example = "null", value = "oprava krácení [persistentní položka]")
  public Double getClaimshortencorr() {
    return claimshortencorr;
  }

  public void setClaimshortencorr(Double claimshortencorr) {
    this.claimshortencorr = claimshortencorr;
  }

  public Holiday claimshortencomp(Double claimshortencomp) {
    this.claimshortencomp = claimshortencomp;
    return this;
  }

   /**
   * vypočtené krácení [persistentní položka]
   * @return claimshortencomp
  **/
  @ApiModelProperty(example = "null", value = "vypočtené krácení [persistentní položka]")
  public Double getClaimshortencomp() {
    return claimshortencomp;
  }

  public void setClaimshortencomp(Double claimshortencomp) {
    this.claimshortencomp = claimshortencomp;
  }

  public Holiday transferwholerest(Boolean transferwholerest) {
    this.transferwholerest = transferwholerest;
    return this;
  }

   /**
   * přenášet vše [persistentní položka]
   * @return transferwholerest
  **/
  @ApiModelProperty(example = "null", value = "přenášet vše [persistentní položka]")
  public Boolean getTransferwholerest() {
    return transferwholerest;
  }

  public void setTransferwholerest(Boolean transferwholerest) {
    this.transferwholerest = transferwholerest;
  }

  public Holiday validfrommonthday(Integer validfrommonthday) {
    this.validfrommonthday = validfrommonthday;
    return this;
  }

   /**
   * platí od
   * @return validfrommonthday
  **/
  @ApiModelProperty(example = "null", value = "platí od")
  public Integer getValidfrommonthday() {
    return validfrommonthday;
  }

  public void setValidfrommonthday(Integer validfrommonthday) {
    this.validfrommonthday = validfrommonthday;
  }

  public Holiday validtomonthday(Integer validtomonthday) {
    this.validtomonthday = validtomonthday;
    return this;
  }

   /**
   * platí do
   * @return validtomonthday
  **/
  @ApiModelProperty(example = "null", value = "platí do")
  public Integer getValidtomonthday() {
    return validtomonthday;
  }

  public void setValidtomonthday(Integer validtomonthday) {
    this.validtomonthday = validtomonthday;
  }

  public Holiday validfrommonth(Integer validfrommonth) {
    this.validfrommonth = validfrommonth;
    return this;
  }

   /**
   * měsíc platnosti od
   * @return validfrommonth
  **/
  @ApiModelProperty(example = "null", value = "měsíc platnosti od")
  public Integer getValidfrommonth() {
    return validfrommonth;
  }

  public void setValidfrommonth(Integer validfrommonth) {
    this.validfrommonth = validfrommonth;
  }

  public Holiday validfromday(Integer validfromday) {
    this.validfromday = validfromday;
    return this;
  }

   /**
   * den platnosti od
   * @return validfromday
  **/
  @ApiModelProperty(example = "null", value = "den platnosti od")
  public Integer getValidfromday() {
    return validfromday;
  }

  public void setValidfromday(Integer validfromday) {
    this.validfromday = validfromday;
  }

  public Holiday validfromdate(String validfromdate) {
    this.validfromdate = validfromdate;
    return this;
  }

   /**
   * datum platnosti od
   * @return validfromdate
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti od")
  public String getValidfromdate() {
    return validfromdate;
  }

  public void setValidfromdate(String validfromdate) {
    this.validfromdate = validfromdate;
  }

  public Holiday validtomonth(Integer validtomonth) {
    this.validtomonth = validtomonth;
    return this;
  }

   /**
   * měsíc platnosti do
   * @return validtomonth
  **/
  @ApiModelProperty(example = "null", value = "měsíc platnosti do")
  public Integer getValidtomonth() {
    return validtomonth;
  }

  public void setValidtomonth(Integer validtomonth) {
    this.validtomonth = validtomonth;
  }

  public Holiday validtoday(Integer validtoday) {
    this.validtoday = validtoday;
    return this;
  }

   /**
   * den platnosti do
   * @return validtoday
  **/
  @ApiModelProperty(example = "null", value = "den platnosti do")
  public Integer getValidtoday() {
    return validtoday;
  }

  public void setValidtoday(Integer validtoday) {
    this.validtoday = validtoday;
  }

  public Holiday validtodate(String validtodate) {
    this.validtodate = validtodate;
    return this;
  }

   /**
   * datum platnosti do
   * @return validtodate
  **/
  @ApiModelProperty(example = "null", value = "datum platnosti do")
  public String getValidtodate() {
    return validtodate;
  }

  public void setValidtodate(String validtodate) {
    this.validtodate = validtodate;
  }

  public Holiday employeeId(String employeeId) {
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

  public Holiday employeename(String employeename) {
    this.employeename = employeename;
    return this;
  }

   /**
   * příjmení a jméno
   * @return employeename
  **/
  @ApiModelProperty(example = "null", value = "příjmení a jméno")
  public String getEmployeename() {
    return employeename;
  }

  public void setEmployeename(String employeename) {
    this.employeename = employeename;
  }

  public Holiday persPersonalnumber(String persPersonalnumber) {
    this.persPersonalnumber = persPersonalnumber;
    return this;
  }

   /**
   * os. číslo
   * @return persPersonalnumber
  **/
  @ApiModelProperty(example = "null", value = "os. číslo")
  public String getPersPersonalnumber() {
    return persPersonalnumber;
  }

  public void setPersPersonalnumber(String persPersonalnumber) {
    this.persPersonalnumber = persPersonalnumber;
  }

  public Holiday claimtype(Integer claimtype) {
    this.claimtype = claimtype;
    return this;
  }

   /**
   * jednotka nároku [persistentní položka]
   * @return claimtype
  **/
  @ApiModelProperty(example = "null", value = "jednotka nároku [persistentní položka]")
  public Integer getClaimtype() {
    return claimtype;
  }

  public void setClaimtype(Integer claimtype) {
    this.claimtype = claimtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holiday holiday = (Holiday) o;
    return Objects.equals(this.displayname, holiday.displayname) &&
        Objects.equals(this.id, holiday.id) &&
        Objects.equals(this.classid, holiday.classid) &&
        Objects.equals(this.objversion, holiday.objversion) &&
        Objects.equals(this.rows, holiday.rows) &&
        Objects.equals(this.goon, holiday.goon) &&
        Objects.equals(this.claimshorten, holiday.claimshorten) &&
        Objects.equals(this.workingrelationId, holiday.workingrelationId) &&
        Objects.equals(this.holidayId, holiday.holidayId) &&
        Objects.equals(this.calendaryear, holiday.calendaryear) &&
        Objects.equals(this.regular, holiday.regular) &&
        Objects.equals(this.claim, holiday.claim) &&
        Objects.equals(this.resttransfer, holiday.resttransfer) &&
        Objects.equals(this.validfromdate2, holiday.validfromdate2) &&
        Objects.equals(this.validtodate2, holiday.validtodate2) &&
        Objects.equals(this.code, holiday.code) &&
        Objects.equals(this.name, holiday.name) &&
        Objects.equals(this.priority, holiday.priority) &&
        Objects.equals(this.payable, holiday.payable) &&
        Objects.equals(this.drawdown, holiday.drawdown) &&
        Objects.equals(this.previousrest, holiday.previousrest) &&
        Objects.equals(this.claimshortencorr, holiday.claimshortencorr) &&
        Objects.equals(this.claimshortencomp, holiday.claimshortencomp) &&
        Objects.equals(this.transferwholerest, holiday.transferwholerest) &&
        Objects.equals(this.validfrommonthday, holiday.validfrommonthday) &&
        Objects.equals(this.validtomonthday, holiday.validtomonthday) &&
        Objects.equals(this.validfrommonth, holiday.validfrommonth) &&
        Objects.equals(this.validfromday, holiday.validfromday) &&
        Objects.equals(this.validfromdate, holiday.validfromdate) &&
        Objects.equals(this.validtomonth, holiday.validtomonth) &&
        Objects.equals(this.validtoday, holiday.validtoday) &&
        Objects.equals(this.validtodate, holiday.validtodate) &&
        Objects.equals(this.employeeId, holiday.employeeId) &&
        Objects.equals(this.employeename, holiday.employeename) &&
        Objects.equals(this.persPersonalnumber, holiday.persPersonalnumber) &&
        Objects.equals(this.claimtype, holiday.claimtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, goon, claimshorten, workingrelationId, holidayId, calendaryear, regular, claim, resttransfer, validfromdate, validtodate, code, name, priority, payable, drawdown, previousrest, claimshortencorr, claimshortencomp, transferwholerest, validfrommonthday, validtomonthday, validfrommonth, validfromday, validfromdate, validtomonth, validtoday, validtodate, employeeId, employeename, persPersonalnumber, claimtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holiday {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    goon: ").append(toIndentedString(goon)).append("\n");
    sb.append("    claimshorten: ").append(toIndentedString(claimshorten)).append("\n");
    sb.append("    workingrelationId: ").append(toIndentedString(workingrelationId)).append("\n");
    sb.append("    holidayId: ").append(toIndentedString(holidayId)).append("\n");
    sb.append("    calendaryear: ").append(toIndentedString(calendaryear)).append("\n");
    sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
    sb.append("    resttransfer: ").append(toIndentedString(resttransfer)).append("\n");
    sb.append("    validfromdate: ").append(toIndentedString(validfromdate)).append("\n");
    sb.append("    validtodate2: ").append(toIndentedString(validtodate2)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    payable: ").append(toIndentedString(payable)).append("\n");
    sb.append("    drawdown: ").append(toIndentedString(drawdown)).append("\n");
    sb.append("    previousrest: ").append(toIndentedString(previousrest)).append("\n");
    sb.append("    claimshortencorr: ").append(toIndentedString(claimshortencorr)).append("\n");
    sb.append("    claimshortencomp: ").append(toIndentedString(claimshortencomp)).append("\n");
    sb.append("    transferwholerest: ").append(toIndentedString(transferwholerest)).append("\n");
    sb.append("    validfrommonthday: ").append(toIndentedString(validfrommonthday)).append("\n");
    sb.append("    validtomonthday: ").append(toIndentedString(validtomonthday)).append("\n");
    sb.append("    validfrommonth: ").append(toIndentedString(validfrommonth)).append("\n");
    sb.append("    validfromday: ").append(toIndentedString(validfromday)).append("\n");
    sb.append("    validfromdate: ").append(toIndentedString(validfromdate)).append("\n");
    sb.append("    validtomonth: ").append(toIndentedString(validtomonth)).append("\n");
    sb.append("    validtoday: ").append(toIndentedString(validtoday)).append("\n");
    sb.append("    validtodate: ").append(toIndentedString(validtodate)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeename: ").append(toIndentedString(employeename)).append("\n");
    sb.append("    persPersonalnumber: ").append(toIndentedString(persPersonalnumber)).append("\n");
    sb.append("    claimtype: ").append(toIndentedString(claimtype)).append("\n");
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

