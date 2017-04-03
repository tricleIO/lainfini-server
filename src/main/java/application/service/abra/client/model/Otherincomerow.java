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
 * Otherincomerow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Otherincomerow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("tamountwithoutvat")
  private Double tamountwithoutvat = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("vatindex_id")
  private String vatindexId = null;

  @SerializedName("vatrate")
  private Double vatrate = null;

  @SerializedName("localtamountwithoutvat")
  private Double localtamountwithoutvat = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("vattamount")
  private Double vattamount = null;

  @SerializedName("incometype_id")
  private String incometypeId = null;

  public Otherincomerow displayname(String displayname) {
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

  public Otherincomerow id(String id) {
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

  public Otherincomerow classid(String classid) {
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

  public Otherincomerow objversion(Integer objversion) {
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

  public Otherincomerow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu ostatní příjem [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu ostatní příjem [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Otherincomerow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Otherincomerow tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * celkem [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "celkem [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Otherincomerow localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * celkem lokálně [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Otherincomerow divisionId(String divisionId) {
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

  public Otherincomerow busorderId(String busorderId) {
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

  public Otherincomerow bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * o.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "o.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Otherincomerow tamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
    return this;
  }

   /**
   * bez daně [persistentní položka]
   * @return tamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně [persistentní položka]")
  public Double getTamountwithoutvat() {
    return tamountwithoutvat;
  }

  public void setTamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
  }

  public Otherincomerow vatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
    return this;
  }

   /**
   * %dph; id objektu dph sazba [persistentní položka]
   * @return vatrateId
  **/
  @ApiModelProperty(example = "null", value = "%dph; id objektu dph sazba [persistentní položka]")
  public String getVatrateId() {
    return vatrateId;
  }

  public void setVatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
  }

  public Otherincomerow vatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
    return this;
  }

   /**
   * dphindex; id objektu dph index [persistentní položka]
   * @return vatindexId
  **/
  @ApiModelProperty(example = "null", value = "dphindex; id objektu dph index [persistentní položka]")
  public String getVatindexId() {
    return vatindexId;
  }

  public void setVatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
  }

  public Otherincomerow vatrate(Double vatrate) {
    this.vatrate = vatrate;
    return this;
  }

   /**
   * dph sazba [persistentní položka]
   * @return vatrate
  **/
  @ApiModelProperty(example = "null", value = "dph sazba [persistentní položka]")
  public Double getVatrate() {
    return vatrate;
  }

  public void setVatrate(Double vatrate) {
    this.vatrate = vatrate;
  }

  public Otherincomerow localtamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
    return this;
  }

   /**
   * bez daně lokálně [persistentní položka]
   * @return localtamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně lokálně [persistentní položka]")
  public Double getLocaltamountwithoutvat() {
    return localtamountwithoutvat;
  }

  public void setLocaltamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
  }

  public Otherincomerow busprojectId(String busprojectId) {
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

  public Otherincomerow text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text [persistentní položka]
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "text [persistentní položka]")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Otherincomerow vattamount(Double vattamount) {
    this.vattamount = vattamount;
    return this;
  }

   /**
   * dph
   * @return vattamount
  **/
  @ApiModelProperty(example = "null", value = "dph")
  public Double getVattamount() {
    return vattamount;
  }

  public void setVattamount(Double vattamount) {
    this.vattamount = vattamount;
  }

  public Otherincomerow incometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
    return this;
  }

   /**
   * typ příjmu; id objektu typ příjmu [persistentní položka]
   * @return incometypeId
  **/
  @ApiModelProperty(example = "null", value = "typ příjmu; id objektu typ příjmu [persistentní položka]")
  public String getIncometypeId() {
    return incometypeId;
  }

  public void setIncometypeId(String incometypeId) {
    this.incometypeId = incometypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Otherincomerow otherincomerow = (Otherincomerow) o;
    return Objects.equals(this.displayname, otherincomerow.displayname) &&
        Objects.equals(this.id, otherincomerow.id) &&
        Objects.equals(this.classid, otherincomerow.classid) &&
        Objects.equals(this.objversion, otherincomerow.objversion) &&
        Objects.equals(this.parentId, otherincomerow.parentId) &&
        Objects.equals(this.posindex, otherincomerow.posindex) &&
        Objects.equals(this.tamount, otherincomerow.tamount) &&
        Objects.equals(this.localtamount, otherincomerow.localtamount) &&
        Objects.equals(this.divisionId, otherincomerow.divisionId) &&
        Objects.equals(this.busorderId, otherincomerow.busorderId) &&
        Objects.equals(this.bustransactionId, otherincomerow.bustransactionId) &&
        Objects.equals(this.tamountwithoutvat, otherincomerow.tamountwithoutvat) &&
        Objects.equals(this.vatrateId, otherincomerow.vatrateId) &&
        Objects.equals(this.vatindexId, otherincomerow.vatindexId) &&
        Objects.equals(this.vatrate, otherincomerow.vatrate) &&
        Objects.equals(this.localtamountwithoutvat, otherincomerow.localtamountwithoutvat) &&
        Objects.equals(this.busprojectId, otherincomerow.busprojectId) &&
        Objects.equals(this.text, otherincomerow.text) &&
        Objects.equals(this.vattamount, otherincomerow.vattamount) &&
        Objects.equals(this.incometypeId, otherincomerow.incometypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, tamount, localtamount, divisionId, busorderId, bustransactionId, tamountwithoutvat, vatrateId, vatindexId, vatrate, localtamountwithoutvat, busprojectId, text, vattamount, incometypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Otherincomerow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    tamountwithoutvat: ").append(toIndentedString(tamountwithoutvat)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    vatindexId: ").append(toIndentedString(vatindexId)).append("\n");
    sb.append("    vatrate: ").append(toIndentedString(vatrate)).append("\n");
    sb.append("    localtamountwithoutvat: ").append(toIndentedString(localtamountwithoutvat)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    vattamount: ").append(toIndentedString(vattamount)).append("\n");
    sb.append("    incometypeId: ").append(toIndentedString(incometypeId)).append("\n");
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

