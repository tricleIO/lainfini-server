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
 * Wlwagetransferdef
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wlwagetransferdef   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("deftype")
  private Integer deftype = null;

  @SerializedName("entrytype_id")
  private String entrytypeId = null;

  @SerializedName("transfertype")
  private Integer transfertype = null;

  @SerializedName("aggregationtype")
  private Integer aggregationtype = null;

  @SerializedName("fieldcode")
  private Integer fieldcode = null;

  @SerializedName("correctionexpression")
  private String correctionexpression = null;

  @SerializedName("wageopertypeidexpr")
  private String wageopertypeidexpr = null;

  @SerializedName("absencetypeidexpr")
  private String absencetypeidexpr = null;

  @SerializedName("sickbenefittypeidexpr")
  private String sickbenefittypeidexpr = null;

  @SerializedName("scriptpackage_id")
  private String scriptpackageId = null;

  @SerializedName("scriptlibrary")
  private String scriptlibrary = null;

  @SerializedName("scriptfunction")
  private String scriptfunction = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("disabledforclosing")
  private Boolean disabledforclosing = null;

  @SerializedName("closingvaluetype")
  private Integer closingvaluetype = null;

  @SerializedName("fieldcodelabel")
  private String fieldcodelabel = null;

  @SerializedName("fieldcodename")
  private String fieldcodename = null;

  @SerializedName("deftypeastext")
  private String deftypeastext = null;

  @SerializedName("aggregationtypeastext")
  private String aggregationtypeastext = null;

  @SerializedName("transfertypeastext")
  private String transfertypeastext = null;

  @SerializedName("scriptpackagename")
  private String scriptpackagename = null;

  public Wlwagetransferdef displayname(String displayname) {
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

  public Wlwagetransferdef id(String id) {
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

  public Wlwagetransferdef classid(String classid) {
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

  public Wlwagetransferdef objversion(Integer objversion) {
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

  public Wlwagetransferdef description(String description) {
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

  public Wlwagetransferdef deftype(Integer deftype) {
    this.deftype = deftype;
    return this;
  }

   /**
   * typ záznamu [persistentní položka]
   * @return deftype
  **/
  @ApiModelProperty(example = "null", value = "typ záznamu [persistentní položka]")
  public Integer getDeftype() {
    return deftype;
  }

  public void setDeftype(Integer deftype) {
    this.deftype = deftype;
  }

  public Wlwagetransferdef entrytypeId(String entrytypeId) {
    this.entrytypeId = entrytypeId;
    return this;
  }

   /**
   * základní typ; id objektu docházka - druh činnosti [persistentní položka]
   * @return entrytypeId
  **/
  @ApiModelProperty(example = "null", value = "základní typ; id objektu docházka - druh činnosti [persistentní položka]")
  public String getEntrytypeId() {
    return entrytypeId;
  }

  public void setEntrytypeId(String entrytypeId) {
    this.entrytypeId = entrytypeId;
  }

  public Wlwagetransferdef transfertype(Integer transfertype) {
    this.transfertype = transfertype;
    return this;
  }

   /**
   * způsob přenosu [persistentní položka]
   * @return transfertype
  **/
  @ApiModelProperty(example = "null", value = "způsob přenosu [persistentní položka]")
  public Integer getTransfertype() {
    return transfertype;
  }

  public void setTransfertype(Integer transfertype) {
    this.transfertype = transfertype;
  }

  public Wlwagetransferdef aggregationtype(Integer aggregationtype) {
    this.aggregationtype = aggregationtype;
    return this;
  }

   /**
   * způsob agregace [persistentní položka]
   * @return aggregationtype
  **/
  @ApiModelProperty(example = "null", value = "způsob agregace [persistentní položka]")
  public Integer getAggregationtype() {
    return aggregationtype;
  }

  public void setAggregationtype(Integer aggregationtype) {
    this.aggregationtype = aggregationtype;
  }

  public Wlwagetransferdef fieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
    return this;
  }

   /**
   * fieldcode cílové položky [persistentní položka]
   * @return fieldcode
  **/
  @ApiModelProperty(example = "null", value = "fieldcode cílové položky [persistentní položka]")
  public Integer getFieldcode() {
    return fieldcode;
  }

  public void setFieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
  }

  public Wlwagetransferdef correctionexpression(String correctionexpression) {
    this.correctionexpression = correctionexpression;
    return this;
  }

   /**
   * výraz korekce [persistentní položka]
   * @return correctionexpression
  **/
  @ApiModelProperty(example = "null", value = "výraz korekce [persistentní položka]")
  public String getCorrectionexpression() {
    return correctionexpression;
  }

  public void setCorrectionexpression(String correctionexpression) {
    this.correctionexpression = correctionexpression;
  }

  public Wlwagetransferdef wageopertypeidexpr(String wageopertypeidexpr) {
    this.wageopertypeidexpr = wageopertypeidexpr;
    return this;
  }

   /**
   * výraz pro zjištění id z druhu výkonu [persistentní položka]
   * @return wageopertypeidexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro zjištění id z druhu výkonu [persistentní položka]")
  public String getWageopertypeidexpr() {
    return wageopertypeidexpr;
  }

  public void setWageopertypeidexpr(String wageopertypeidexpr) {
    this.wageopertypeidexpr = wageopertypeidexpr;
  }

  public Wlwagetransferdef absencetypeidexpr(String absencetypeidexpr) {
    this.absencetypeidexpr = absencetypeidexpr;
    return this;
  }

   /**
   * výraz pro zjištění id z druhu srážek [persistentní položka]
   * @return absencetypeidexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro zjištění id z druhu srážek [persistentní položka]")
  public String getAbsencetypeidexpr() {
    return absencetypeidexpr;
  }

  public void setAbsencetypeidexpr(String absencetypeidexpr) {
    this.absencetypeidexpr = absencetypeidexpr;
  }

  public Wlwagetransferdef sickbenefittypeidexpr(String sickbenefittypeidexpr) {
    this.sickbenefittypeidexpr = sickbenefittypeidexpr;
    return this;
  }

   /**
   * výraz pro zjištění id z druhu nem. dávky [persistentní položka]
   * @return sickbenefittypeidexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro zjištění id z druhu nem. dávky [persistentní položka]")
  public String getSickbenefittypeidexpr() {
    return sickbenefittypeidexpr;
  }

  public void setSickbenefittypeidexpr(String sickbenefittypeidexpr) {
    this.sickbenefittypeidexpr = sickbenefittypeidexpr;
  }

  public Wlwagetransferdef scriptpackageId(String scriptpackageId) {
    this.scriptpackageId = scriptpackageId;
    return this;
  }

   /**
   * balíček skriptů [persistentní položka]
   * @return scriptpackageId
  **/
  @ApiModelProperty(example = "null", value = "balíček skriptů [persistentní položka]")
  public String getScriptpackageId() {
    return scriptpackageId;
  }

  public void setScriptpackageId(String scriptpackageId) {
    this.scriptpackageId = scriptpackageId;
  }

  public Wlwagetransferdef scriptlibrary(String scriptlibrary) {
    this.scriptlibrary = scriptlibrary;
    return this;
  }

   /**
   * knihovna skriptů [persistentní položka]
   * @return scriptlibrary
  **/
  @ApiModelProperty(example = "null", value = "knihovna skriptů [persistentní položka]")
  public String getScriptlibrary() {
    return scriptlibrary;
  }

  public void setScriptlibrary(String scriptlibrary) {
    this.scriptlibrary = scriptlibrary;
  }

  public Wlwagetransferdef scriptfunction(String scriptfunction) {
    this.scriptfunction = scriptfunction;
    return this;
  }

   /**
   * funkce [persistentní položka]
   * @return scriptfunction
  **/
  @ApiModelProperty(example = "null", value = "funkce [persistentní položka]")
  public String getScriptfunction() {
    return scriptfunction;
  }

  public void setScriptfunction(String scriptfunction) {
    this.scriptfunction = scriptfunction;
  }

  public Wlwagetransferdef docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada dokladů; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Wlwagetransferdef disabledforclosing(Boolean disabledforclosing) {
    this.disabledforclosing = disabledforclosing;
    return this;
  }

   /**
   * neaktivní [persistentní položka]
   * @return disabledforclosing
  **/
  @ApiModelProperty(example = "null", value = "neaktivní [persistentní položka]")
  public Boolean getDisabledforclosing() {
    return disabledforclosing;
  }

  public void setDisabledforclosing(Boolean disabledforclosing) {
    this.disabledforclosing = disabledforclosing;
  }

  public Wlwagetransferdef closingvaluetype(Integer closingvaluetype) {
    this.closingvaluetype = closingvaluetype;
    return this;
  }

   /**
   * typ počítané položky [persistentní položka]
   * @return closingvaluetype
  **/
  @ApiModelProperty(example = "null", value = "typ počítané položky [persistentní položka]")
  public Integer getClosingvaluetype() {
    return closingvaluetype;
  }

  public void setClosingvaluetype(Integer closingvaluetype) {
    this.closingvaluetype = closingvaluetype;
  }

  public Wlwagetransferdef fieldcodelabel(String fieldcodelabel) {
    this.fieldcodelabel = fieldcodelabel;
    return this;
  }

   /**
   * fieldcode cílové položky
   * @return fieldcodelabel
  **/
  @ApiModelProperty(example = "null", value = "fieldcode cílové položky")
  public String getFieldcodelabel() {
    return fieldcodelabel;
  }

  public void setFieldcodelabel(String fieldcodelabel) {
    this.fieldcodelabel = fieldcodelabel;
  }

  public Wlwagetransferdef fieldcodename(String fieldcodename) {
    this.fieldcodename = fieldcodename;
    return this;
  }

   /**
   * fieldcode cílové položky
   * @return fieldcodename
  **/
  @ApiModelProperty(example = "null", value = "fieldcode cílové položky")
  public String getFieldcodename() {
    return fieldcodename;
  }

  public void setFieldcodename(String fieldcodename) {
    this.fieldcodename = fieldcodename;
  }

  public Wlwagetransferdef deftypeastext(String deftypeastext) {
    this.deftypeastext = deftypeastext;
    return this;
  }

   /**
   * typ záznamu
   * @return deftypeastext
  **/
  @ApiModelProperty(example = "null", value = "typ záznamu")
  public String getDeftypeastext() {
    return deftypeastext;
  }

  public void setDeftypeastext(String deftypeastext) {
    this.deftypeastext = deftypeastext;
  }

  public Wlwagetransferdef aggregationtypeastext(String aggregationtypeastext) {
    this.aggregationtypeastext = aggregationtypeastext;
    return this;
  }

   /**
   * způsob agregace
   * @return aggregationtypeastext
  **/
  @ApiModelProperty(example = "null", value = "způsob agregace")
  public String getAggregationtypeastext() {
    return aggregationtypeastext;
  }

  public void setAggregationtypeastext(String aggregationtypeastext) {
    this.aggregationtypeastext = aggregationtypeastext;
  }

  public Wlwagetransferdef transfertypeastext(String transfertypeastext) {
    this.transfertypeastext = transfertypeastext;
    return this;
  }

   /**
   * způsob přenosu
   * @return transfertypeastext
  **/
  @ApiModelProperty(example = "null", value = "způsob přenosu")
  public String getTransfertypeastext() {
    return transfertypeastext;
  }

  public void setTransfertypeastext(String transfertypeastext) {
    this.transfertypeastext = transfertypeastext;
  }

  public Wlwagetransferdef scriptpackagename(String scriptpackagename) {
    this.scriptpackagename = scriptpackagename;
    return this;
  }

   /**
   * název balíčku skriptů
   * @return scriptpackagename
  **/
  @ApiModelProperty(example = "null", value = "název balíčku skriptů")
  public String getScriptpackagename() {
    return scriptpackagename;
  }

  public void setScriptpackagename(String scriptpackagename) {
    this.scriptpackagename = scriptpackagename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wlwagetransferdef wlwagetransferdef = (Wlwagetransferdef) o;
    return Objects.equals(this.displayname, wlwagetransferdef.displayname) &&
        Objects.equals(this.id, wlwagetransferdef.id) &&
        Objects.equals(this.classid, wlwagetransferdef.classid) &&
        Objects.equals(this.objversion, wlwagetransferdef.objversion) &&
        Objects.equals(this.description, wlwagetransferdef.description) &&
        Objects.equals(this.deftype, wlwagetransferdef.deftype) &&
        Objects.equals(this.entrytypeId, wlwagetransferdef.entrytypeId) &&
        Objects.equals(this.transfertype, wlwagetransferdef.transfertype) &&
        Objects.equals(this.aggregationtype, wlwagetransferdef.aggregationtype) &&
        Objects.equals(this.fieldcode, wlwagetransferdef.fieldcode) &&
        Objects.equals(this.correctionexpression, wlwagetransferdef.correctionexpression) &&
        Objects.equals(this.wageopertypeidexpr, wlwagetransferdef.wageopertypeidexpr) &&
        Objects.equals(this.absencetypeidexpr, wlwagetransferdef.absencetypeidexpr) &&
        Objects.equals(this.sickbenefittypeidexpr, wlwagetransferdef.sickbenefittypeidexpr) &&
        Objects.equals(this.scriptpackageId, wlwagetransferdef.scriptpackageId) &&
        Objects.equals(this.scriptlibrary, wlwagetransferdef.scriptlibrary) &&
        Objects.equals(this.scriptfunction, wlwagetransferdef.scriptfunction) &&
        Objects.equals(this.docqueueId, wlwagetransferdef.docqueueId) &&
        Objects.equals(this.disabledforclosing, wlwagetransferdef.disabledforclosing) &&
        Objects.equals(this.closingvaluetype, wlwagetransferdef.closingvaluetype) &&
        Objects.equals(this.fieldcodelabel, wlwagetransferdef.fieldcodelabel) &&
        Objects.equals(this.fieldcodename, wlwagetransferdef.fieldcodename) &&
        Objects.equals(this.deftypeastext, wlwagetransferdef.deftypeastext) &&
        Objects.equals(this.aggregationtypeastext, wlwagetransferdef.aggregationtypeastext) &&
        Objects.equals(this.transfertypeastext, wlwagetransferdef.transfertypeastext) &&
        Objects.equals(this.scriptpackagename, wlwagetransferdef.scriptpackagename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, description, deftype, entrytypeId, transfertype, aggregationtype, fieldcode, correctionexpression, wageopertypeidexpr, absencetypeidexpr, sickbenefittypeidexpr, scriptpackageId, scriptlibrary, scriptfunction, docqueueId, disabledforclosing, closingvaluetype, fieldcodelabel, fieldcodename, deftypeastext, aggregationtypeastext, transfertypeastext, scriptpackagename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wlwagetransferdef {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deftype: ").append(toIndentedString(deftype)).append("\n");
    sb.append("    entrytypeId: ").append(toIndentedString(entrytypeId)).append("\n");
    sb.append("    transfertype: ").append(toIndentedString(transfertype)).append("\n");
    sb.append("    aggregationtype: ").append(toIndentedString(aggregationtype)).append("\n");
    sb.append("    fieldcode: ").append(toIndentedString(fieldcode)).append("\n");
    sb.append("    correctionexpression: ").append(toIndentedString(correctionexpression)).append("\n");
    sb.append("    wageopertypeidexpr: ").append(toIndentedString(wageopertypeidexpr)).append("\n");
    sb.append("    absencetypeidexpr: ").append(toIndentedString(absencetypeidexpr)).append("\n");
    sb.append("    sickbenefittypeidexpr: ").append(toIndentedString(sickbenefittypeidexpr)).append("\n");
    sb.append("    scriptpackageId: ").append(toIndentedString(scriptpackageId)).append("\n");
    sb.append("    scriptlibrary: ").append(toIndentedString(scriptlibrary)).append("\n");
    sb.append("    scriptfunction: ").append(toIndentedString(scriptfunction)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    disabledforclosing: ").append(toIndentedString(disabledforclosing)).append("\n");
    sb.append("    closingvaluetype: ").append(toIndentedString(closingvaluetype)).append("\n");
    sb.append("    fieldcodelabel: ").append(toIndentedString(fieldcodelabel)).append("\n");
    sb.append("    fieldcodename: ").append(toIndentedString(fieldcodename)).append("\n");
    sb.append("    deftypeastext: ").append(toIndentedString(deftypeastext)).append("\n");
    sb.append("    aggregationtypeastext: ").append(toIndentedString(aggregationtypeastext)).append("\n");
    sb.append("    transfertypeastext: ").append(toIndentedString(transfertypeastext)).append("\n");
    sb.append("    scriptpackagename: ").append(toIndentedString(scriptpackagename)).append("\n");
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

