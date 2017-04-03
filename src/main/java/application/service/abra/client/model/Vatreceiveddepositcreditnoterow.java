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
 * Vatreceiveddepositcreditnoterow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Vatreceiveddepositcreditnoterow   {
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

  @SerializedName("text")
  private String text = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("vatindex_id")
  private String vatindexId = null;

  @SerializedName("vatrate")
  private Double vatrate = null;

  @SerializedName("tamountwithoutvat")
  private Double tamountwithoutvat = null;

  @SerializedName("localtamountwithoutvat")
  private Double localtamountwithoutvat = null;

  @SerializedName("vattamount")
  private Double vattamount = null;

  @SerializedName("drcarticle_id")
  private String drcarticleId = null;

  @SerializedName("drcquantity")
  private Double drcquantity = null;

  @SerializedName("drcqunit")
  private String drcqunit = null;

  @SerializedName("localbyhand")
  private Boolean localbyhand = null;

  @SerializedName("localvattamount")
  private Double localvattamount = null;

  @SerializedName("vatmode")
  private Integer vatmode = null;

  @SerializedName("usedratio")
  private Boolean usedratio = null;

  @SerializedName("rsource_id")
  private String rsourceId = null;

  @SerializedName("rowextid")
  private String rowextid = null;

  public Vatreceiveddepositcreditnoterow displayname(String displayname) {
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

  public Vatreceiveddepositcreditnoterow id(String id) {
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

  public Vatreceiveddepositcreditnoterow classid(String classid) {
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

  public Vatreceiveddepositcreditnoterow objversion(Integer objversion) {
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

  public Vatreceiveddepositcreditnoterow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu dobropis daň.zál.listu přijatého [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu dobropis daň.zál.listu přijatého [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Vatreceiveddepositcreditnoterow posindex(Integer posindex) {
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

  public Vatreceiveddepositcreditnoterow tamount(Double tamount) {
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

  public Vatreceiveddepositcreditnoterow localtamount(Double localtamount) {
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

  public Vatreceiveddepositcreditnoterow text(String text) {
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

  public Vatreceiveddepositcreditnoterow divisionId(String divisionId) {
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

  public Vatreceiveddepositcreditnoterow busorderId(String busorderId) {
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

  public Vatreceiveddepositcreditnoterow bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obch.případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obch.případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Vatreceiveddepositcreditnoterow busprojectId(String busprojectId) {
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

  public Vatreceiveddepositcreditnoterow vatrateId(String vatrateId) {
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

  public Vatreceiveddepositcreditnoterow vatindexId(String vatindexId) {
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

  public Vatreceiveddepositcreditnoterow vatrate(Double vatrate) {
    this.vatrate = vatrate;
    return this;
  }

   /**
   * %dph [persistentní položka]
   * @return vatrate
  **/
  @ApiModelProperty(example = "null", value = "%dph [persistentní položka]")
  public Double getVatrate() {
    return vatrate;
  }

  public void setVatrate(Double vatrate) {
    this.vatrate = vatrate;
  }

  public Vatreceiveddepositcreditnoterow tamountwithoutvat(Double tamountwithoutvat) {
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

  public Vatreceiveddepositcreditnoterow localtamountwithoutvat(Double localtamountwithoutvat) {
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

  public Vatreceiveddepositcreditnoterow vattamount(Double vattamount) {
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

  public Vatreceiveddepositcreditnoterow drcarticleId(String drcarticleId) {
    this.drcarticleId = drcarticleId;
    return this;
  }

   /**
   * typ plnění; id objektu kód typu plnění [persistentní položka]
   * @return drcarticleId
  **/
  @ApiModelProperty(example = "null", value = "typ plnění; id objektu kód typu plnění [persistentní položka]")
  public String getDrcarticleId() {
    return drcarticleId;
  }

  public void setDrcarticleId(String drcarticleId) {
    this.drcarticleId = drcarticleId;
  }

  public Vatreceiveddepositcreditnoterow drcquantity(Double drcquantity) {
    this.drcquantity = drcquantity;
    return this;
  }

   /**
   * vykazované množství [persistentní položka]
   * @return drcquantity
  **/
  @ApiModelProperty(example = "null", value = "vykazované množství [persistentní položka]")
  public Double getDrcquantity() {
    return drcquantity;
  }

  public void setDrcquantity(Double drcquantity) {
    this.drcquantity = drcquantity;
  }

  public Vatreceiveddepositcreditnoterow drcqunit(String drcqunit) {
    this.drcqunit = drcqunit;
    return this;
  }

   /**
   * vykazovaná jednotka [persistentní položka]
   * @return drcqunit
  **/
  @ApiModelProperty(example = "null", value = "vykazovaná jednotka [persistentní položka]")
  public String getDrcqunit() {
    return drcqunit;
  }

  public void setDrcqunit(String drcqunit) {
    this.drcqunit = drcqunit;
  }

  public Vatreceiveddepositcreditnoterow localbyhand(Boolean localbyhand) {
    this.localbyhand = localbyhand;
    return this;
  }

   /**
   * ručně zadáno [persistentní položka]
   * @return localbyhand
  **/
  @ApiModelProperty(example = "null", value = "ručně zadáno [persistentní položka]")
  public Boolean getLocalbyhand() {
    return localbyhand;
  }

  public void setLocalbyhand(Boolean localbyhand) {
    this.localbyhand = localbyhand;
  }

  public Vatreceiveddepositcreditnoterow localvattamount(Double localvattamount) {
    this.localvattamount = localvattamount;
    return this;
  }

   /**
   * dph (lok.)
   * @return localvattamount
  **/
  @ApiModelProperty(example = "null", value = "dph (lok.)")
  public Double getLocalvattamount() {
    return localvattamount;
  }

  public void setLocalvattamount(Double localvattamount) {
    this.localvattamount = localvattamount;
  }

  public Vatreceiveddepositcreditnoterow vatmode(Integer vatmode) {
    this.vatmode = vatmode;
    return this;
  }

   /**
   * režim dph [persistentní položka]
   * @return vatmode
  **/
  @ApiModelProperty(example = "null", value = "režim dph [persistentní položka]")
  public Integer getVatmode() {
    return vatmode;
  }

  public void setVatmode(Integer vatmode) {
    this.vatmode = vatmode;
  }

  public Vatreceiveddepositcreditnoterow usedratio(Boolean usedratio) {
    this.usedratio = usedratio;
    return this;
  }

   /**
   * použit poměr [persistentní položka]
   * @return usedratio
  **/
  @ApiModelProperty(example = "null", value = "použit poměr [persistentní položka]")
  public Boolean getUsedratio() {
    return usedratio;
  }

  public void setUsedratio(Boolean usedratio) {
    this.usedratio = usedratio;
  }

  public Vatreceiveddepositcreditnoterow rsourceId(String rsourceId) {
    this.rsourceId = rsourceId;
    return this;
  }

   /**
   * Ř. dobr.dokladu; id objektu daňový zálohový list přijatý - řádek [persistentní položka]
   * @return rsourceId
  **/
  @ApiModelProperty(example = "null", value = "Ř. dobr.dokladu; id objektu daňový zálohový list přijatý - řádek [persistentní položka]")
  public String getRsourceId() {
    return rsourceId;
  }

  public void setRsourceId(String rsourceId) {
    this.rsourceId = rsourceId;
  }

  public Vatreceiveddepositcreditnoterow rowextid(String rowextid) {
    this.rowextid = rowextid;
    return this;
  }

   /**
   * odkaz na isdoc [persistentní položka]
   * @return rowextid
  **/
  @ApiModelProperty(example = "null", value = "odkaz na isdoc [persistentní položka]")
  public String getRowextid() {
    return rowextid;
  }

  public void setRowextid(String rowextid) {
    this.rowextid = rowextid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vatreceiveddepositcreditnoterow vatreceiveddepositcreditnoterow = (Vatreceiveddepositcreditnoterow) o;
    return Objects.equals(this.displayname, vatreceiveddepositcreditnoterow.displayname) &&
        Objects.equals(this.id, vatreceiveddepositcreditnoterow.id) &&
        Objects.equals(this.classid, vatreceiveddepositcreditnoterow.classid) &&
        Objects.equals(this.objversion, vatreceiveddepositcreditnoterow.objversion) &&
        Objects.equals(this.parentId, vatreceiveddepositcreditnoterow.parentId) &&
        Objects.equals(this.posindex, vatreceiveddepositcreditnoterow.posindex) &&
        Objects.equals(this.tamount, vatreceiveddepositcreditnoterow.tamount) &&
        Objects.equals(this.localtamount, vatreceiveddepositcreditnoterow.localtamount) &&
        Objects.equals(this.text, vatreceiveddepositcreditnoterow.text) &&
        Objects.equals(this.divisionId, vatreceiveddepositcreditnoterow.divisionId) &&
        Objects.equals(this.busorderId, vatreceiveddepositcreditnoterow.busorderId) &&
        Objects.equals(this.bustransactionId, vatreceiveddepositcreditnoterow.bustransactionId) &&
        Objects.equals(this.busprojectId, vatreceiveddepositcreditnoterow.busprojectId) &&
        Objects.equals(this.vatrateId, vatreceiveddepositcreditnoterow.vatrateId) &&
        Objects.equals(this.vatindexId, vatreceiveddepositcreditnoterow.vatindexId) &&
        Objects.equals(this.vatrate, vatreceiveddepositcreditnoterow.vatrate) &&
        Objects.equals(this.tamountwithoutvat, vatreceiveddepositcreditnoterow.tamountwithoutvat) &&
        Objects.equals(this.localtamountwithoutvat, vatreceiveddepositcreditnoterow.localtamountwithoutvat) &&
        Objects.equals(this.vattamount, vatreceiveddepositcreditnoterow.vattamount) &&
        Objects.equals(this.drcarticleId, vatreceiveddepositcreditnoterow.drcarticleId) &&
        Objects.equals(this.drcquantity, vatreceiveddepositcreditnoterow.drcquantity) &&
        Objects.equals(this.drcqunit, vatreceiveddepositcreditnoterow.drcqunit) &&
        Objects.equals(this.localbyhand, vatreceiveddepositcreditnoterow.localbyhand) &&
        Objects.equals(this.localvattamount, vatreceiveddepositcreditnoterow.localvattamount) &&
        Objects.equals(this.vatmode, vatreceiveddepositcreditnoterow.vatmode) &&
        Objects.equals(this.usedratio, vatreceiveddepositcreditnoterow.usedratio) &&
        Objects.equals(this.rsourceId, vatreceiveddepositcreditnoterow.rsourceId) &&
        Objects.equals(this.rowextid, vatreceiveddepositcreditnoterow.rowextid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, tamount, localtamount, text, divisionId, busorderId, bustransactionId, busprojectId, vatrateId, vatindexId, vatrate, tamountwithoutvat, localtamountwithoutvat, vattamount, drcarticleId, drcquantity, drcqunit, localbyhand, localvattamount, vatmode, usedratio, rsourceId, rowextid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vatreceiveddepositcreditnoterow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    vatindexId: ").append(toIndentedString(vatindexId)).append("\n");
    sb.append("    vatrate: ").append(toIndentedString(vatrate)).append("\n");
    sb.append("    tamountwithoutvat: ").append(toIndentedString(tamountwithoutvat)).append("\n");
    sb.append("    localtamountwithoutvat: ").append(toIndentedString(localtamountwithoutvat)).append("\n");
    sb.append("    vattamount: ").append(toIndentedString(vattamount)).append("\n");
    sb.append("    drcarticleId: ").append(toIndentedString(drcarticleId)).append("\n");
    sb.append("    drcquantity: ").append(toIndentedString(drcquantity)).append("\n");
    sb.append("    drcqunit: ").append(toIndentedString(drcqunit)).append("\n");
    sb.append("    localbyhand: ").append(toIndentedString(localbyhand)).append("\n");
    sb.append("    localvattamount: ").append(toIndentedString(localvattamount)).append("\n");
    sb.append("    vatmode: ").append(toIndentedString(vatmode)).append("\n");
    sb.append("    usedratio: ").append(toIndentedString(usedratio)).append("\n");
    sb.append("    rsourceId: ").append(toIndentedString(rsourceId)).append("\n");
    sb.append("    rowextid: ").append(toIndentedString(rowextid)).append("\n");
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

