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

import java.util.Objects;


/**
 * Pdmissuedcontenttype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Pdmissuedcontenttype   {
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

  @SerializedName("shortname")
  private String shortname = null;

  @SerializedName("includeintoreports")
  private Boolean includeintoreports = null;

  @SerializedName("genpostnumber")
  private Boolean genpostnumber = null;

  @SerializedName("reportnumber")
  private String reportnumber = null;

  @SerializedName("postcategory")
  private String postcategory = null;

  @SerializedName("numberqueue")
  private Integer numberqueue = null;

  @SerializedName("numberprefix")
  private String numberprefix = null;

  @SerializedName("numbersuffix")
  private String numbersuffix = null;

  @SerializedName("numberlimit")
  private Integer numberlimit = null;

  @SerializedName("numberqueue_id")
  private String numberqueueId = null;

  @SerializedName("completenumber")
  private String completenumber = null;

  public Pdmissuedcontenttype displayname(String displayname) {
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

  public Pdmissuedcontenttype id(String id) {
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

  public Pdmissuedcontenttype classid(String classid) {
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

  public Pdmissuedcontenttype objversion(Integer objversion) {
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

  public Pdmissuedcontenttype hidden(Boolean hidden) {
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

  public Pdmissuedcontenttype code(String code) {
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

  public Pdmissuedcontenttype name(String name) {
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

  public Pdmissuedcontenttype shortname(String shortname) {
    this.shortname = shortname;
    return this;
  }

   /**
   * krátký název [persistentní položka]
   * @return shortname
  **/
  @ApiModelProperty(example = "null", value = "krátký název [persistentní položka]")
  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }

  public Pdmissuedcontenttype includeintoreports(Boolean includeintoreports) {
    this.includeintoreports = includeintoreports;
    return this;
  }

   /**
   * zahrnovat do podacích archů [persistentní položka]
   * @return includeintoreports
  **/
  @ApiModelProperty(example = "null", value = "zahrnovat do podacích archů [persistentní položka]")
  public Boolean getIncludeintoreports() {
    return includeintoreports;
  }

  public void setIncludeintoreports(Boolean includeintoreports) {
    this.includeintoreports = includeintoreports;
  }

  public Pdmissuedcontenttype genpostnumber(Boolean genpostnumber) {
    this.genpostnumber = genpostnumber;
    return this;
  }

   /**
   * generování podacího čísla [persistentní položka]
   * @return genpostnumber
  **/
  @ApiModelProperty(example = "null", value = "generování podacího čísla [persistentní položka]")
  public Boolean getGenpostnumber() {
    return genpostnumber;
  }

  public void setGenpostnumber(Boolean genpostnumber) {
    this.genpostnumber = genpostnumber;
  }

  public Pdmissuedcontenttype reportnumber(String reportnumber) {
    this.reportnumber = reportnumber;
    return this;
  }

   /**
   * název podacího archu [persistentní položka]
   * @return reportnumber
  **/
  @ApiModelProperty(example = "null", value = "název podacího archu [persistentní položka]")
  public String getReportnumber() {
    return reportnumber;
  }

  public void setReportnumber(String reportnumber) {
    this.reportnumber = reportnumber;
  }

  public Pdmissuedcontenttype postcategory(String postcategory) {
    this.postcategory = postcategory;
    return this;
  }

   /**
   * kategorie pošty [persistentní položka]
   * @return postcategory
  **/
  @ApiModelProperty(example = "null", value = "kategorie pošty [persistentní položka]")
  public String getPostcategory() {
    return postcategory;
  }

  public void setPostcategory(String postcategory) {
    this.postcategory = postcategory;
  }

  public Pdmissuedcontenttype numberqueue(Integer numberqueue) {
    this.numberqueue = numberqueue;
    return this;
  }

   /**
   * Číselná řada [persistentní položka]
   * @return numberqueue
  **/
  @ApiModelProperty(example = "null", value = "Číselná řada [persistentní položka]")
  public Integer getNumberqueue() {
    return numberqueue;
  }

  public void setNumberqueue(Integer numberqueue) {
    this.numberqueue = numberqueue;
  }

  public Pdmissuedcontenttype numberprefix(String numberprefix) {
    this.numberprefix = numberprefix;
    return this;
  }

   /**
   * prefix číselné řady [persistentní položka]
   * @return numberprefix
  **/
  @ApiModelProperty(example = "null", value = "prefix číselné řady [persistentní položka]")
  public String getNumberprefix() {
    return numberprefix;
  }

  public void setNumberprefix(String numberprefix) {
    this.numberprefix = numberprefix;
  }

  public Pdmissuedcontenttype numbersuffix(String numbersuffix) {
    this.numbersuffix = numbersuffix;
    return this;
  }

   /**
   * přípona číselné řady [persistentní položka]
   * @return numbersuffix
  **/
  @ApiModelProperty(example = "null", value = "přípona číselné řady [persistentní položka]")
  public String getNumbersuffix() {
    return numbersuffix;
  }

  public void setNumbersuffix(String numbersuffix) {
    this.numbersuffix = numbersuffix;
  }

  public Pdmissuedcontenttype numberlimit(Integer numberlimit) {
    this.numberlimit = numberlimit;
    return this;
  }

   /**
   * limit číselné řady [persistentní položka]
   * @return numberlimit
  **/
  @ApiModelProperty(example = "null", value = "limit číselné řady [persistentní položka]")
  public Integer getNumberlimit() {
    return numberlimit;
  }

  public void setNumberlimit(Integer numberlimit) {
    this.numberlimit = numberlimit;
  }

  public Pdmissuedcontenttype numberqueueId(String numberqueueId) {
    this.numberqueueId = numberqueueId;
    return this;
  }

   /**
   * odkaz na číselnou řadu; id objektu typy obsahů odeslané pošty [persistentní položka]
   * @return numberqueueId
  **/
  @ApiModelProperty(example = "null", value = "odkaz na číselnou řadu; id objektu typy obsahů odeslané pošty [persistentní položka]")
  public String getNumberqueueId() {
    return numberqueueId;
  }

  public void setNumberqueueId(String numberqueueId) {
    this.numberqueueId = numberqueueId;
  }

  public Pdmissuedcontenttype completenumber(String completenumber) {
    this.completenumber = completenumber;
    return this;
  }

   /**
   * sestavená číselná řada
   * @return completenumber
  **/
  @ApiModelProperty(example = "null", value = "sestavená číselná řada")
  public String getCompletenumber() {
    return completenumber;
  }

  public void setCompletenumber(String completenumber) {
    this.completenumber = completenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pdmissuedcontenttype pdmissuedcontenttype = (Pdmissuedcontenttype) o;
    return Objects.equals(this.displayname, pdmissuedcontenttype.displayname) &&
        Objects.equals(this.id, pdmissuedcontenttype.id) &&
        Objects.equals(this.classid, pdmissuedcontenttype.classid) &&
        Objects.equals(this.objversion, pdmissuedcontenttype.objversion) &&
        Objects.equals(this.hidden, pdmissuedcontenttype.hidden) &&
        Objects.equals(this.code, pdmissuedcontenttype.code) &&
        Objects.equals(this.name, pdmissuedcontenttype.name) &&
        Objects.equals(this.shortname, pdmissuedcontenttype.shortname) &&
        Objects.equals(this.includeintoreports, pdmissuedcontenttype.includeintoreports) &&
        Objects.equals(this.genpostnumber, pdmissuedcontenttype.genpostnumber) &&
        Objects.equals(this.reportnumber, pdmissuedcontenttype.reportnumber) &&
        Objects.equals(this.postcategory, pdmissuedcontenttype.postcategory) &&
        Objects.equals(this.numberqueue, pdmissuedcontenttype.numberqueue) &&
        Objects.equals(this.numberprefix, pdmissuedcontenttype.numberprefix) &&
        Objects.equals(this.numbersuffix, pdmissuedcontenttype.numbersuffix) &&
        Objects.equals(this.numberlimit, pdmissuedcontenttype.numberlimit) &&
        Objects.equals(this.numberqueueId, pdmissuedcontenttype.numberqueueId) &&
        Objects.equals(this.completenumber, pdmissuedcontenttype.completenumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, shortname, includeintoreports, genpostnumber, reportnumber, postcategory, numberqueue, numberprefix, numbersuffix, numberlimit, numberqueueId, completenumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pdmissuedcontenttype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortname: ").append(toIndentedString(shortname)).append("\n");
    sb.append("    includeintoreports: ").append(toIndentedString(includeintoreports)).append("\n");
    sb.append("    genpostnumber: ").append(toIndentedString(genpostnumber)).append("\n");
    sb.append("    reportnumber: ").append(toIndentedString(reportnumber)).append("\n");
    sb.append("    postcategory: ").append(toIndentedString(postcategory)).append("\n");
    sb.append("    numberqueue: ").append(toIndentedString(numberqueue)).append("\n");
    sb.append("    numberprefix: ").append(toIndentedString(numberprefix)).append("\n");
    sb.append("    numbersuffix: ").append(toIndentedString(numbersuffix)).append("\n");
    sb.append("    numberlimit: ").append(toIndentedString(numberlimit)).append("\n");
    sb.append("    numberqueueId: ").append(toIndentedString(numberqueueId)).append("\n");
    sb.append("    completenumber: ").append(toIndentedString(completenumber)).append("\n");
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

