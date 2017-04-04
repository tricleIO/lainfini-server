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
 * Sickbenefittype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Sickbenefittype   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Sickbenefittyperow> rows = new ArrayList<Sickbenefittyperow>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sickbasetype")
  private Integer sickbasetype = null;

  @SerializedName("onecase")
  private Boolean onecase = null;

  @SerializedName("isabsent")
  private Boolean isabsent = null;

  @SerializedName("maxdaycount")
  private Double maxdaycount = null;

  @SerializedName("averagereduction")
  private Boolean averagereduction = null;

  @SerializedName("noexcludeddays")
  private Boolean noexcludeddays = null;

  @SerializedName("isunpaid")
  private Boolean isunpaid = null;

  @SerializedName("maxexcludeddays")
  private Double maxexcludeddays = null;

  @SerializedName("sbasetypestext")
  private String sbasetypestext = null;

  @SerializedName("sbasetypeltext")
  private String sbasetypeltext = null;

  @SerializedName("payworkingdays")
  private Boolean payworkingdays = null;

  @SerializedName("amountexpression")
  private String amountexpression = null;

  @SerializedName("validto$date")
  private DateTime validtodate = null;

  @SerializedName("continuingsickbenefit")
  private Boolean continuingsickbenefit = null;

  @SerializedName("sickbenefitrounding")
  private Integer sickbenefitrounding = null;

  @SerializedName("daybaserounding")
  private Integer daybaserounding = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  public Sickbenefittype displayname(String displayname) {
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

  public Sickbenefittype id(String id) {
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

  public Sickbenefittype classid(String classid) {
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

  public Sickbenefittype objversion(Integer objversion) {
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

  public Sickbenefittype rows(List<Sickbenefittyperow> rows) {
    this.rows = rows;
    return this;
  }

  public Sickbenefittype addRowsItem(Sickbenefittyperow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * sazby; kolekce bo sazba nemocenské dávky [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "sazby; kolekce bo sazba nemocenské dávky [nepersistentní položka]")
  public List<Sickbenefittyperow> getRows() {
    return rows;
  }

  public void setRows(List<Sickbenefittyperow> rows) {
    this.rows = rows;
  }

  public Sickbenefittype hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Sickbenefittype code(String code) {
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

  public Sickbenefittype name(String name) {
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

  public Sickbenefittype sickbasetype(Integer sickbasetype) {
    this.sickbasetype = sickbasetype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return sickbasetype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getSickbasetype() {
    return sickbasetype;
  }

  public void setSickbasetype(Integer sickbasetype) {
    this.sickbasetype = sickbasetype;
  }

  public Sickbenefittype onecase(Boolean onecase) {
    this.onecase = onecase;
    return this;
  }

   /**
   * jedn. [persistentní položka]
   * @return onecase
  **/
  @ApiModelProperty(example = "null", value = "jedn. [persistentní položka]")
  public Boolean getOnecase() {
    return onecase;
  }

  public void setOnecase(Boolean onecase) {
    this.onecase = onecase;
  }

  public Sickbenefittype isabsent(Boolean isabsent) {
    this.isabsent = isabsent;
    return this;
  }

   /**
   * nepřít. [persistentní položka]
   * @return isabsent
  **/
  @ApiModelProperty(example = "null", value = "nepřít. [persistentní položka]")
  public Boolean getIsabsent() {
    return isabsent;
  }

  public void setIsabsent(Boolean isabsent) {
    this.isabsent = isabsent;
  }

  public Sickbenefittype maxdaycount(Double maxdaycount) {
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

  public Sickbenefittype averagereduction(Boolean averagereduction) {
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

  public Sickbenefittype noexcludeddays(Boolean noexcludeddays) {
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

  public Sickbenefittype isunpaid(Boolean isunpaid) {
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

  public Sickbenefittype maxexcludeddays(Double maxexcludeddays) {
    this.maxexcludeddays = maxexcludeddays;
    return this;
  }

   /**
   * max. počet vyl. dob [persistentní položka]
   * @return maxexcludeddays
  **/
  @ApiModelProperty(example = "null", value = "max. počet vyl. dob [persistentní položka]")
  public Double getMaxexcludeddays() {
    return maxexcludeddays;
  }

  public void setMaxexcludeddays(Double maxexcludeddays) {
    this.maxexcludeddays = maxexcludeddays;
  }

  public Sickbenefittype sbasetypestext(String sbasetypestext) {
    this.sbasetypestext = sbasetypestext;
    return this;
  }

   /**
   * typ
   * @return sbasetypestext
  **/
  @ApiModelProperty(example = "null", value = "typ")
  public String getSbasetypestext() {
    return sbasetypestext;
  }

  public void setSbasetypestext(String sbasetypestext) {
    this.sbasetypestext = sbasetypestext;
  }

  public Sickbenefittype sbasetypeltext(String sbasetypeltext) {
    this.sbasetypeltext = sbasetypeltext;
    return this;
  }

   /**
   * typ - popis
   * @return sbasetypeltext
  **/
  @ApiModelProperty(example = "null", value = "typ - popis")
  public String getSbasetypeltext() {
    return sbasetypeltext;
  }

  public void setSbasetypeltext(String sbasetypeltext) {
    this.sbasetypeltext = sbasetypeltext;
  }

  public Sickbenefittype payworkingdays(Boolean payworkingdays) {
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

  public Sickbenefittype amountexpression(String amountexpression) {
    this.amountexpression = amountexpression;
    return this;
  }

   /**
   * korekce částky [persistentní položka]
   * @return amountexpression
  **/
  @ApiModelProperty(example = "null", value = "korekce částky [persistentní položka]")
  public String getAmountexpression() {
    return amountexpression;
  }

  public void setAmountexpression(String amountexpression) {
    this.amountexpression = amountexpression;
  }

  public Sickbenefittype validtodate(DateTime validtodate) {
    this.validtodate = validtodate;
    return this;
  }

   /**
   * platí do [persistentní položka]
   * @return validtodate
  **/
  @ApiModelProperty(example = "null", value = "platí do [persistentní položka]")
  public DateTime getValidtodate() {
    return validtodate;
  }

  public void setValidtodate(DateTime validtodate) {
    this.validtodate = validtodate;
  }

  public Sickbenefittype continuingsickbenefit(Boolean continuingsickbenefit) {
    this.continuingsickbenefit = continuingsickbenefit;
    return this;
  }

   /**
   * pokračující dávka [persistentní položka]
   * @return continuingsickbenefit
  **/
  @ApiModelProperty(example = "null", value = "pokračující dávka [persistentní položka]")
  public Boolean getContinuingsickbenefit() {
    return continuingsickbenefit;
  }

  public void setContinuingsickbenefit(Boolean continuingsickbenefit) {
    this.continuingsickbenefit = continuingsickbenefit;
  }

  public Sickbenefittype sickbenefitrounding(Integer sickbenefitrounding) {
    this.sickbenefitrounding = sickbenefitrounding;
    return this;
  }

   /**
   * zaokrouhlení dávky [persistentní položka]
   * @return sickbenefitrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení dávky [persistentní položka]")
  public Integer getSickbenefitrounding() {
    return sickbenefitrounding;
  }

  public void setSickbenefitrounding(Integer sickbenefitrounding) {
    this.sickbenefitrounding = sickbenefitrounding;
  }

  public Sickbenefittype daybaserounding(Integer daybaserounding) {
    this.daybaserounding = daybaserounding;
    return this;
  }

   /**
   * zaokrouhlení dvz [persistentní položka]
   * @return daybaserounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení dvz [persistentní položka]")
  public Integer getDaybaserounding() {
    return daybaserounding;
  }

  public void setDaybaserounding(Integer daybaserounding) {
    this.daybaserounding = daybaserounding;
  }

  public Sickbenefittype preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * předvyplňovat [persistentní položka]
   * @return preferred
  **/
  @ApiModelProperty(example = "null", value = "předvyplňovat [persistentní položka]")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sickbenefittype sickbenefittype = (Sickbenefittype) o;
    return Objects.equals(this.displayname, sickbenefittype.displayname) &&
        Objects.equals(this.id, sickbenefittype.id) &&
        Objects.equals(this.classid, sickbenefittype.classid) &&
        Objects.equals(this.objversion, sickbenefittype.objversion) &&
        Objects.equals(this.rows, sickbenefittype.rows) &&
        Objects.equals(this.hidden, sickbenefittype.hidden) &&
        Objects.equals(this.code, sickbenefittype.code) &&
        Objects.equals(this.name, sickbenefittype.name) &&
        Objects.equals(this.sickbasetype, sickbenefittype.sickbasetype) &&
        Objects.equals(this.onecase, sickbenefittype.onecase) &&
        Objects.equals(this.isabsent, sickbenefittype.isabsent) &&
        Objects.equals(this.maxdaycount, sickbenefittype.maxdaycount) &&
        Objects.equals(this.averagereduction, sickbenefittype.averagereduction) &&
        Objects.equals(this.noexcludeddays, sickbenefittype.noexcludeddays) &&
        Objects.equals(this.isunpaid, sickbenefittype.isunpaid) &&
        Objects.equals(this.maxexcludeddays, sickbenefittype.maxexcludeddays) &&
        Objects.equals(this.sbasetypestext, sickbenefittype.sbasetypestext) &&
        Objects.equals(this.sbasetypeltext, sickbenefittype.sbasetypeltext) &&
        Objects.equals(this.payworkingdays, sickbenefittype.payworkingdays) &&
        Objects.equals(this.amountexpression, sickbenefittype.amountexpression) &&
        Objects.equals(this.validtodate, sickbenefittype.validtodate) &&
        Objects.equals(this.continuingsickbenefit, sickbenefittype.continuingsickbenefit) &&
        Objects.equals(this.sickbenefitrounding, sickbenefittype.sickbenefitrounding) &&
        Objects.equals(this.daybaserounding, sickbenefittype.daybaserounding) &&
        Objects.equals(this.preferred, sickbenefittype.preferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, code, name, sickbasetype, onecase, isabsent, maxdaycount, averagereduction, noexcludeddays, isunpaid, maxexcludeddays, sbasetypestext, sbasetypeltext, payworkingdays, amountexpression, validtodate, continuingsickbenefit, sickbenefitrounding, daybaserounding, preferred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sickbenefittype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sickbasetype: ").append(toIndentedString(sickbasetype)).append("\n");
    sb.append("    onecase: ").append(toIndentedString(onecase)).append("\n");
    sb.append("    isabsent: ").append(toIndentedString(isabsent)).append("\n");
    sb.append("    maxdaycount: ").append(toIndentedString(maxdaycount)).append("\n");
    sb.append("    averagereduction: ").append(toIndentedString(averagereduction)).append("\n");
    sb.append("    noexcludeddays: ").append(toIndentedString(noexcludeddays)).append("\n");
    sb.append("    isunpaid: ").append(toIndentedString(isunpaid)).append("\n");
    sb.append("    maxexcludeddays: ").append(toIndentedString(maxexcludeddays)).append("\n");
    sb.append("    sbasetypestext: ").append(toIndentedString(sbasetypestext)).append("\n");
    sb.append("    sbasetypeltext: ").append(toIndentedString(sbasetypeltext)).append("\n");
    sb.append("    payworkingdays: ").append(toIndentedString(payworkingdays)).append("\n");
    sb.append("    amountexpression: ").append(toIndentedString(amountexpression)).append("\n");
    sb.append("    validtodate: ").append(toIndentedString(validtodate)).append("\n");
    sb.append("    continuingsickbenefit: ").append(toIndentedString(continuingsickbenefit)).append("\n");
    sb.append("    sickbenefitrounding: ").append(toIndentedString(sickbenefitrounding)).append("\n");
    sb.append("    daybaserounding: ").append(toIndentedString(daybaserounding)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
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
