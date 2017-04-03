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
 * Assetdeprecgroupshistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Assetdeprecgroupshistory   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("assetcard_id")
  private String assetcardId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("taxdepreciationgroup_id")
  private String taxdepreciationgroupId = null;

  @SerializedName("accdepreciationgroup_id")
  private String accdepreciationgroupId = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("taxwithaccounted")
  private Boolean taxwithaccounted = null;

  public Assetdeprecgroupshistory displayname(String displayname) {
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

  public Assetdeprecgroupshistory id(String id) {
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

  public Assetdeprecgroupshistory classid(String classid) {
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

  public Assetdeprecgroupshistory objversion(Integer objversion) {
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

  public Assetdeprecgroupshistory assetcardId(String assetcardId) {
    this.assetcardId = assetcardId;
    return this;
  }

   /**
   * karta majetku; id objektu karta majetku [persistentní položka]
   * @return assetcardId
  **/
  @ApiModelProperty(example = "null", value = "karta majetku; id objektu karta majetku [persistentní položka]")
  public String getAssetcardId() {
    return assetcardId;
  }

  public void setAssetcardId(String assetcardId) {
    this.assetcardId = assetcardId;
  }

  public Assetdeprecgroupshistory periodId(String periodId) {
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

  public Assetdeprecgroupshistory taxdepreciationgroupId(String taxdepreciationgroupId) {
    this.taxdepreciationgroupId = taxdepreciationgroupId;
    return this;
  }

   /**
   * daň.odpis.sk.; id objektu daňová odpisová skupina [persistentní položka]
   * @return taxdepreciationgroupId
  **/
  @ApiModelProperty(example = "null", value = "daň.odpis.sk.; id objektu daňová odpisová skupina [persistentní položka]")
  public String getTaxdepreciationgroupId() {
    return taxdepreciationgroupId;
  }

  public void setTaxdepreciationgroupId(String taxdepreciationgroupId) {
    this.taxdepreciationgroupId = taxdepreciationgroupId;
  }

  public Assetdeprecgroupshistory accdepreciationgroupId(String accdepreciationgroupId) {
    this.accdepreciationgroupId = accdepreciationgroupId;
    return this;
  }

   /**
   * Účet.odpis.sk.; id objektu Účetní odpisová skupina [persistentní položka]
   * @return accdepreciationgroupId
  **/
  @ApiModelProperty(example = "null", value = "Účet.odpis.sk.; id objektu Účetní odpisová skupina [persistentní položka]")
  public String getAccdepreciationgroupId() {
    return accdepreciationgroupId;
  }

  public void setAccdepreciationgroupId(String accdepreciationgroupId) {
    this.accdepreciationgroupId = accdepreciationgroupId;
  }

  public Assetdeprecgroupshistory note(String note) {
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

  public Assetdeprecgroupshistory comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Assetdeprecgroupshistory taxwithaccounted(Boolean taxwithaccounted) {
    this.taxwithaccounted = taxwithaccounted;
    return this;
  }

   /**
   * změnit i zaúčtované [persistentní položka]
   * @return taxwithaccounted
  **/
  @ApiModelProperty(example = "null", value = "změnit i zaúčtované [persistentní položka]")
  public Boolean getTaxwithaccounted() {
    return taxwithaccounted;
  }

  public void setTaxwithaccounted(Boolean taxwithaccounted) {
    this.taxwithaccounted = taxwithaccounted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assetdeprecgroupshistory assetdeprecgroupshistory = (Assetdeprecgroupshistory) o;
    return Objects.equals(this.displayname, assetdeprecgroupshistory.displayname) &&
        Objects.equals(this.id, assetdeprecgroupshistory.id) &&
        Objects.equals(this.classid, assetdeprecgroupshistory.classid) &&
        Objects.equals(this.objversion, assetdeprecgroupshistory.objversion) &&
        Objects.equals(this.assetcardId, assetdeprecgroupshistory.assetcardId) &&
        Objects.equals(this.periodId, assetdeprecgroupshistory.periodId) &&
        Objects.equals(this.taxdepreciationgroupId, assetdeprecgroupshistory.taxdepreciationgroupId) &&
        Objects.equals(this.accdepreciationgroupId, assetdeprecgroupshistory.accdepreciationgroupId) &&
        Objects.equals(this.note, assetdeprecgroupshistory.note) &&
        Objects.equals(this.comment, assetdeprecgroupshistory.comment) &&
        Objects.equals(this.taxwithaccounted, assetdeprecgroupshistory.taxwithaccounted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, assetcardId, periodId, taxdepreciationgroupId, accdepreciationgroupId, note, comment, taxwithaccounted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assetdeprecgroupshistory {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    assetcardId: ").append(toIndentedString(assetcardId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    taxdepreciationgroupId: ").append(toIndentedString(taxdepreciationgroupId)).append("\n");
    sb.append("    accdepreciationgroupId: ").append(toIndentedString(accdepreciationgroupId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    taxwithaccounted: ").append(toIndentedString(taxwithaccounted)).append("\n");
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

