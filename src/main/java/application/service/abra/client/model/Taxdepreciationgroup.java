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
 * Taxdepreciationgroup
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Taxdepreciationgroup   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("firstyearcoef")
  private Double firstyearcoef = null;

  @SerializedName("otheryearscoef")
  private Double otheryearscoef = null;

  @SerializedName("overvaluedcoef")
  private Double overvaluedcoef = null;

  @SerializedName("yearscount")
  private Integer yearscount = null;

  @SerializedName("algorithmtype")
  private Integer algorithmtype = null;

  @SerializedName("algorithmtypeastext")
  private String algorithmtypeastext = null;

  @SerializedName("validfrom$date")
  private DateTime validfromdate = null;

  @SerializedName("validto$date")
  private DateTime validtodate = null;

  @SerializedName("constantrate")
  private Double constantrate = null;

  @SerializedName("wayofdefconst")
  private Integer wayofdefconst = null;

  @SerializedName("numerator")
  private Double numerator = null;

  @SerializedName("denominator")
  private Double denominator = null;

  public Taxdepreciationgroup displayname(String displayname) {
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

  public Taxdepreciationgroup id(String id) {
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

  public Taxdepreciationgroup classid(String classid) {
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

  public Taxdepreciationgroup objversion(Integer objversion) {
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

  public Taxdepreciationgroup hidden(Boolean hidden) {
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

  public Taxdepreciationgroup code(String code) {
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

  public Taxdepreciationgroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název odpisové skupiny [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název odpisové skupiny [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Taxdepreciationgroup firstyearcoef(Double firstyearcoef) {
    this.firstyearcoef = firstyearcoef;
    return this;
  }

   /**
   * koef.první [persistentní položka]
   * @return firstyearcoef
  **/
  @ApiModelProperty(example = "null", value = "koef.první [persistentní položka]")
  public Double getFirstyearcoef() {
    return firstyearcoef;
  }

  public void setFirstyearcoef(Double firstyearcoef) {
    this.firstyearcoef = firstyearcoef;
  }

  public Taxdepreciationgroup otheryearscoef(Double otheryearscoef) {
    this.otheryearscoef = otheryearscoef;
    return this;
  }

   /**
   * koef.další [persistentní položka]
   * @return otheryearscoef
  **/
  @ApiModelProperty(example = "null", value = "koef.další [persistentní položka]")
  public Double getOtheryearscoef() {
    return otheryearscoef;
  }

  public void setOtheryearscoef(Double otheryearscoef) {
    this.otheryearscoef = otheryearscoef;
  }

  public Taxdepreciationgroup overvaluedcoef(Double overvaluedcoef) {
    this.overvaluedcoef = overvaluedcoef;
    return this;
  }

   /**
   * koef.zvýš. [persistentní položka]
   * @return overvaluedcoef
  **/
  @ApiModelProperty(example = "null", value = "koef.zvýš. [persistentní položka]")
  public Double getOvervaluedcoef() {
    return overvaluedcoef;
  }

  public void setOvervaluedcoef(Double overvaluedcoef) {
    this.overvaluedcoef = overvaluedcoef;
  }

  public Taxdepreciationgroup yearscount(Integer yearscount) {
    this.yearscount = yearscount;
    return this;
  }

   /**
   * počet let [persistentní položka]
   * @return yearscount
  **/
  @ApiModelProperty(example = "null", value = "počet let [persistentní položka]")
  public Integer getYearscount() {
    return yearscount;
  }

  public void setYearscount(Integer yearscount) {
    this.yearscount = yearscount;
  }

  public Taxdepreciationgroup algorithmtype(Integer algorithmtype) {
    this.algorithmtype = algorithmtype;
    return this;
  }

   /**
   * algoritmus [persistentní položka]
   * @return algorithmtype
  **/
  @ApiModelProperty(example = "null", value = "algoritmus [persistentní položka]")
  public Integer getAlgorithmtype() {
    return algorithmtype;
  }

  public void setAlgorithmtype(Integer algorithmtype) {
    this.algorithmtype = algorithmtype;
  }

  public Taxdepreciationgroup algorithmtypeastext(String algorithmtypeastext) {
    this.algorithmtypeastext = algorithmtypeastext;
    return this;
  }

   /**
   * algoritmus textově
   * @return algorithmtypeastext
  **/
  @ApiModelProperty(example = "null", value = "algoritmus textově")
  public String getAlgorithmtypeastext() {
    return algorithmtypeastext;
  }

  public void setAlgorithmtypeastext(String algorithmtypeastext) {
    this.algorithmtypeastext = algorithmtypeastext;
  }

  public Taxdepreciationgroup validfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
    return this;
  }

   /**
   * platí od data [persistentní položka]
   * @return validfromdate
  **/
  @ApiModelProperty(example = "null", value = "platí od data [persistentní položka]")
  public DateTime getValidfromdate() {
    return validfromdate;
  }

  public void setValidfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
  }

  public Taxdepreciationgroup validtodate(DateTime validtodate) {
    this.validtodate = validtodate;
    return this;
  }

   /**
   * platí do data [persistentní položka]
   * @return validtodate
  **/
  @ApiModelProperty(example = "null", value = "platí do data [persistentní položka]")
  public DateTime getValidtodate() {
    return validtodate;
  }

  public void setValidtodate(DateTime validtodate) {
    this.validtodate = validtodate;
  }

  public Taxdepreciationgroup constantrate(Double constantrate) {
    this.constantrate = constantrate;
    return this;
  }

   /**
   * konst.odp.
   * @return constantrate
  **/
  @ApiModelProperty(example = "null", value = "konst.odp.")
  public Double getConstantrate() {
    return constantrate;
  }

  public void setConstantrate(Double constantrate) {
    this.constantrate = constantrate;
  }

  public Taxdepreciationgroup wayofdefconst(Integer wayofdefconst) {
    this.wayofdefconst = wayofdefconst;
    return this;
  }

   /**
   * typ def. [persistentní položka]
   * @return wayofdefconst
  **/
  @ApiModelProperty(example = "null", value = "typ def. [persistentní položka]")
  public Integer getWayofdefconst() {
    return wayofdefconst;
  }

  public void setWayofdefconst(Integer wayofdefconst) {
    this.wayofdefconst = wayofdefconst;
  }

  public Taxdepreciationgroup numerator(Double numerator) {
    this.numerator = numerator;
    return this;
  }

   /**
   * Čitatel [persistentní položka]
   * @return numerator
  **/
  @ApiModelProperty(example = "null", value = "Čitatel [persistentní položka]")
  public Double getNumerator() {
    return numerator;
  }

  public void setNumerator(Double numerator) {
    this.numerator = numerator;
  }

  public Taxdepreciationgroup denominator(Double denominator) {
    this.denominator = denominator;
    return this;
  }

   /**
   * jmenovatel [persistentní položka]
   * @return denominator
  **/
  @ApiModelProperty(example = "null", value = "jmenovatel [persistentní položka]")
  public Double getDenominator() {
    return denominator;
  }

  public void setDenominator(Double denominator) {
    this.denominator = denominator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxdepreciationgroup taxdepreciationgroup = (Taxdepreciationgroup) o;
    return Objects.equals(this.displayname, taxdepreciationgroup.displayname) &&
        Objects.equals(this.id, taxdepreciationgroup.id) &&
        Objects.equals(this.classid, taxdepreciationgroup.classid) &&
        Objects.equals(this.objversion, taxdepreciationgroup.objversion) &&
        Objects.equals(this.hidden, taxdepreciationgroup.hidden) &&
        Objects.equals(this.code, taxdepreciationgroup.code) &&
        Objects.equals(this.name, taxdepreciationgroup.name) &&
        Objects.equals(this.firstyearcoef, taxdepreciationgroup.firstyearcoef) &&
        Objects.equals(this.otheryearscoef, taxdepreciationgroup.otheryearscoef) &&
        Objects.equals(this.overvaluedcoef, taxdepreciationgroup.overvaluedcoef) &&
        Objects.equals(this.yearscount, taxdepreciationgroup.yearscount) &&
        Objects.equals(this.algorithmtype, taxdepreciationgroup.algorithmtype) &&
        Objects.equals(this.algorithmtypeastext, taxdepreciationgroup.algorithmtypeastext) &&
        Objects.equals(this.validfromdate, taxdepreciationgroup.validfromdate) &&
        Objects.equals(this.validtodate, taxdepreciationgroup.validtodate) &&
        Objects.equals(this.constantrate, taxdepreciationgroup.constantrate) &&
        Objects.equals(this.wayofdefconst, taxdepreciationgroup.wayofdefconst) &&
        Objects.equals(this.numerator, taxdepreciationgroup.numerator) &&
        Objects.equals(this.denominator, taxdepreciationgroup.denominator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, firstyearcoef, otheryearscoef, overvaluedcoef, yearscount, algorithmtype, algorithmtypeastext, validfromdate, validtodate, constantrate, wayofdefconst, numerator, denominator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxdepreciationgroup {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    firstyearcoef: ").append(toIndentedString(firstyearcoef)).append("\n");
    sb.append("    otheryearscoef: ").append(toIndentedString(otheryearscoef)).append("\n");
    sb.append("    overvaluedcoef: ").append(toIndentedString(overvaluedcoef)).append("\n");
    sb.append("    yearscount: ").append(toIndentedString(yearscount)).append("\n");
    sb.append("    algorithmtype: ").append(toIndentedString(algorithmtype)).append("\n");
    sb.append("    algorithmtypeastext: ").append(toIndentedString(algorithmtypeastext)).append("\n");
    sb.append("    validfromdate: ").append(toIndentedString(validfromdate)).append("\n");
    sb.append("    validtodate: ").append(toIndentedString(validtodate)).append("\n");
    sb.append("    constantrate: ").append(toIndentedString(constantrate)).append("\n");
    sb.append("    wayofdefconst: ").append(toIndentedString(wayofdefconst)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
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
