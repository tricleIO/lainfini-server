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
 * Assettype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Assettype   {
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

  @SerializedName("depreciationtype")
  private Integer depreciationtype = null;

  @SerializedName("depreciationtypeastext")
  private String depreciationtypeastext = null;

  @SerializedName("accpresetdefin_id")
  private String accpresetdefinId = null;

  @SerializedName("accpresetdefdeprec_id")
  private String accpresetdefdeprecId = null;

  @SerializedName("accpresetdefout_id")
  private String accpresetdefoutId = null;

  @SerializedName("accpresetvaluechange_id")
  private String accpresetvaluechangeId = null;

  @SerializedName("tangibletype")
  private Integer tangibletype = null;

  @SerializedName("tangibletypeastext")
  private String tangibletypeastext = null;

  public Assettype displayname(String displayname) {
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

  public Assettype id(String id) {
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

  public Assettype classid(String classid) {
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

  public Assettype objversion(Integer objversion) {
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

  public Assettype hidden(Boolean hidden) {
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

  public Assettype code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód druhu [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód druhu [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Assettype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * druh majetku [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "druh majetku [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Assettype depreciationtype(Integer depreciationtype) {
    this.depreciationtype = depreciationtype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return depreciationtype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getDepreciationtype() {
    return depreciationtype;
  }

  public void setDepreciationtype(Integer depreciationtype) {
    this.depreciationtype = depreciationtype;
  }

  public Assettype depreciationtypeastext(String depreciationtypeastext) {
    this.depreciationtypeastext = depreciationtypeastext;
    return this;
  }

   /**
   * typ majetku
   * @return depreciationtypeastext
  **/
  @ApiModelProperty(example = "null", value = "typ majetku")
  public String getDepreciationtypeastext() {
    return depreciationtypeastext;
  }

  public void setDepreciationtypeastext(String depreciationtypeastext) {
    this.depreciationtypeastext = depreciationtypeastext;
  }

  public Assettype accpresetdefinId(String accpresetdefinId) {
    this.accpresetdefinId = accpresetdefinId;
    return this;
  }

   /**
   * předkontace pro zařazení maj.; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefinId
  **/
  @ApiModelProperty(example = "null", value = "předkontace pro zařazení maj.; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefinId() {
    return accpresetdefinId;
  }

  public void setAccpresetdefinId(String accpresetdefinId) {
    this.accpresetdefinId = accpresetdefinId;
  }

  public Assettype accpresetdefdeprecId(String accpresetdefdeprecId) {
    this.accpresetdefdeprecId = accpresetdefdeprecId;
    return this;
  }

   /**
   * předkontace pro odpisy; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefdeprecId
  **/
  @ApiModelProperty(example = "null", value = "předkontace pro odpisy; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefdeprecId() {
    return accpresetdefdeprecId;
  }

  public void setAccpresetdefdeprecId(String accpresetdefdeprecId) {
    this.accpresetdefdeprecId = accpresetdefdeprecId;
  }

  public Assettype accpresetdefoutId(String accpresetdefoutId) {
    this.accpresetdefoutId = accpresetdefoutId;
    return this;
  }

   /**
   * předkontace pro vyřazení; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefoutId
  **/
  @ApiModelProperty(example = "null", value = "předkontace pro vyřazení; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefoutId() {
    return accpresetdefoutId;
  }

  public void setAccpresetdefoutId(String accpresetdefoutId) {
    this.accpresetdefoutId = accpresetdefoutId;
  }

  public Assettype accpresetvaluechangeId(String accpresetvaluechangeId) {
    this.accpresetvaluechangeId = accpresetvaluechangeId;
    return this;
  }

   /**
   * předkontace pro změnu ceny; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetvaluechangeId
  **/
  @ApiModelProperty(example = "null", value = "předkontace pro změnu ceny; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetvaluechangeId() {
    return accpresetvaluechangeId;
  }

  public void setAccpresetvaluechangeId(String accpresetvaluechangeId) {
    this.accpresetvaluechangeId = accpresetvaluechangeId;
  }

  public Assettype tangibletype(Integer tangibletype) {
    this.tangibletype = tangibletype;
    return this;
  }

   /**
   * typ-hmotný [persistentní položka]
   * @return tangibletype
  **/
  @ApiModelProperty(example = "null", value = "typ-hmotný [persistentní položka]")
  public Integer getTangibletype() {
    return tangibletype;
  }

  public void setTangibletype(Integer tangibletype) {
    this.tangibletype = tangibletype;
  }

  public Assettype tangibletypeastext(String tangibletypeastext) {
    this.tangibletypeastext = tangibletypeastext;
    return this;
  }

   /**
   * typ-hmotný
   * @return tangibletypeastext
  **/
  @ApiModelProperty(example = "null", value = "typ-hmotný")
  public String getTangibletypeastext() {
    return tangibletypeastext;
  }

  public void setTangibletypeastext(String tangibletypeastext) {
    this.tangibletypeastext = tangibletypeastext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assettype assettype = (Assettype) o;
    return Objects.equals(this.displayname, assettype.displayname) &&
        Objects.equals(this.id, assettype.id) &&
        Objects.equals(this.classid, assettype.classid) &&
        Objects.equals(this.objversion, assettype.objversion) &&
        Objects.equals(this.hidden, assettype.hidden) &&
        Objects.equals(this.code, assettype.code) &&
        Objects.equals(this.name, assettype.name) &&
        Objects.equals(this.depreciationtype, assettype.depreciationtype) &&
        Objects.equals(this.depreciationtypeastext, assettype.depreciationtypeastext) &&
        Objects.equals(this.accpresetdefinId, assettype.accpresetdefinId) &&
        Objects.equals(this.accpresetdefdeprecId, assettype.accpresetdefdeprecId) &&
        Objects.equals(this.accpresetdefoutId, assettype.accpresetdefoutId) &&
        Objects.equals(this.accpresetvaluechangeId, assettype.accpresetvaluechangeId) &&
        Objects.equals(this.tangibletype, assettype.tangibletype) &&
        Objects.equals(this.tangibletypeastext, assettype.tangibletypeastext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, code, name, depreciationtype, depreciationtypeastext, accpresetdefinId, accpresetdefdeprecId, accpresetdefoutId, accpresetvaluechangeId, tangibletype, tangibletypeastext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assettype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    depreciationtype: ").append(toIndentedString(depreciationtype)).append("\n");
    sb.append("    depreciationtypeastext: ").append(toIndentedString(depreciationtypeastext)).append("\n");
    sb.append("    accpresetdefinId: ").append(toIndentedString(accpresetdefinId)).append("\n");
    sb.append("    accpresetdefdeprecId: ").append(toIndentedString(accpresetdefdeprecId)).append("\n");
    sb.append("    accpresetdefoutId: ").append(toIndentedString(accpresetdefoutId)).append("\n");
    sb.append("    accpresetvaluechangeId: ").append(toIndentedString(accpresetvaluechangeId)).append("\n");
    sb.append("    tangibletype: ").append(toIndentedString(tangibletype)).append("\n");
    sb.append("    tangibletypeastext: ").append(toIndentedString(tangibletypeastext)).append("\n");
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

