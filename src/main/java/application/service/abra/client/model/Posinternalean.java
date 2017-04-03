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
 * Posinternalean
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posinternalean   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("eantype")
  private Integer eantype = null;

  @SerializedName("eanmask")
  private String eanmask = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("posdiscount_id")
  private String posdiscountId = null;

  @SerializedName("ean")
  private String ean = null;

  public Posinternalean displayname(String displayname) {
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

  public Posinternalean id(String id) {
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

  public Posinternalean classid(String classid) {
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

  public Posinternalean objversion(Integer objversion) {
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

  public Posinternalean eantype(Integer eantype) {
    this.eantype = eantype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return eantype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getEantype() {
    return eantype;
  }

  public void setEantype(Integer eantype) {
    this.eantype = eantype;
  }

  public Posinternalean eanmask(String eanmask) {
    this.eanmask = eanmask;
    return this;
  }

   /**
   * maska [persistentní položka]
   * @return eanmask
  **/
  @ApiModelProperty(example = "null", value = "maska [persistentní položka]")
  public String getEanmask() {
    return eanmask;
  }

  public void setEanmask(String eanmask) {
    this.eanmask = eanmask;
  }

  public Posinternalean name(String name) {
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

  public Posinternalean posdiscountId(String posdiscountId) {
    this.posdiscountId = posdiscountId;
    return this;
  }

   /**
   * sleva; id objektu sleva pro pokladní prodej [persistentní položka]
   * @return posdiscountId
  **/
  @ApiModelProperty(example = "null", value = "sleva; id objektu sleva pro pokladní prodej [persistentní položka]")
  public String getPosdiscountId() {
    return posdiscountId;
  }

  public void setPosdiscountId(String posdiscountId) {
    this.posdiscountId = posdiscountId;
  }

  public Posinternalean ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * ean kupónu [persistentní položka]
   * @return ean
  **/
  @ApiModelProperty(example = "null", value = "ean kupónu [persistentní položka]")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posinternalean posinternalean = (Posinternalean) o;
    return Objects.equals(this.displayname, posinternalean.displayname) &&
        Objects.equals(this.id, posinternalean.id) &&
        Objects.equals(this.classid, posinternalean.classid) &&
        Objects.equals(this.objversion, posinternalean.objversion) &&
        Objects.equals(this.eantype, posinternalean.eantype) &&
        Objects.equals(this.eanmask, posinternalean.eanmask) &&
        Objects.equals(this.name, posinternalean.name) &&
        Objects.equals(this.posdiscountId, posinternalean.posdiscountId) &&
        Objects.equals(this.ean, posinternalean.ean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, eantype, eanmask, name, posdiscountId, ean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posinternalean {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    eantype: ").append(toIndentedString(eantype)).append("\n");
    sb.append("    eanmask: ").append(toIndentedString(eanmask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    posdiscountId: ").append(toIndentedString(posdiscountId)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
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

