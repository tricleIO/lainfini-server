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
 * Loanschedulerow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Loanschedulerow   {
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

  @SerializedName("duedate$date")
  private DateTime duedatedate = null;

  @SerializedName("principaltamount")
  private Double principaltamount = null;

  @SerializedName("localprincipaltamount")
  private Double localprincipaltamount = null;

  @SerializedName("interesttamount")
  private Double interesttamount = null;

  @SerializedName("localinteresttamount")
  private Double localinteresttamount = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("paydoc_id")
  private String paydocId = null;

  @SerializedName("interestpaydoc_id")
  private String interestpaydocId = null;

  @SerializedName("interestparts")
  private List<Loanscheduleinterestpart> interestparts = new ArrayList<Loanscheduleinterestpart>();

  @SerializedName("principalpaydocs")
  private List<Loanscheduleprincipalpaydoc> principalpaydocs = new ArrayList<Loanscheduleprincipalpaydoc>();

  @SerializedName("principalpaydocdisplay")
  private String principalpaydocdisplay = null;

  @SerializedName("paidamount")
  private Double paidamount = null;

  @SerializedName("localpaidamount")
  private Double localpaidamount = null;

  public Loanschedulerow displayname(String displayname) {
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

  public Loanschedulerow id(String id) {
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

  public Loanschedulerow classid(String classid) {
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

  public Loanschedulerow objversion(Integer objversion) {
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

  public Loanschedulerow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu splátkový kalendář [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu splátkový kalendář [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Loanschedulerow posindex(Integer posindex) {
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

  public Loanschedulerow duedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
    return this;
  }

   /**
   * datum splatnosti [persistentní položka]
   * @return duedatedate
  **/
  @ApiModelProperty(example = "null", value = "datum splatnosti [persistentní položka]")
  public DateTime getDuedatedate() {
    return duedatedate;
  }

  public void setDuedatedate(DateTime duedatedate) {
    this.duedatedate = duedatedate;
  }

  public Loanschedulerow principaltamount(Double principaltamount) {
    this.principaltamount = principaltamount;
    return this;
  }

   /**
   * splácená jistina [persistentní položka]
   * @return principaltamount
  **/
  @ApiModelProperty(example = "null", value = "splácená jistina [persistentní položka]")
  public Double getPrincipaltamount() {
    return principaltamount;
  }

  public void setPrincipaltamount(Double principaltamount) {
    this.principaltamount = principaltamount;
  }

  public Loanschedulerow localprincipaltamount(Double localprincipaltamount) {
    this.localprincipaltamount = localprincipaltamount;
    return this;
  }

   /**
   * splácená jistina lok. [persistentní položka]
   * @return localprincipaltamount
  **/
  @ApiModelProperty(example = "null", value = "splácená jistina lok. [persistentní položka]")
  public Double getLocalprincipaltamount() {
    return localprincipaltamount;
  }

  public void setLocalprincipaltamount(Double localprincipaltamount) {
    this.localprincipaltamount = localprincipaltamount;
  }

  public Loanschedulerow interesttamount(Double interesttamount) {
    this.interesttamount = interesttamount;
    return this;
  }

   /**
   * splácený úrok [persistentní položka]
   * @return interesttamount
  **/
  @ApiModelProperty(example = "null", value = "splácený úrok [persistentní položka]")
  public Double getInteresttamount() {
    return interesttamount;
  }

  public void setInteresttamount(Double interesttamount) {
    this.interesttamount = interesttamount;
  }

  public Loanschedulerow localinteresttamount(Double localinteresttamount) {
    this.localinteresttamount = localinteresttamount;
    return this;
  }

   /**
   * splácený úrok lok. [persistentní položka]
   * @return localinteresttamount
  **/
  @ApiModelProperty(example = "null", value = "splácený úrok lok. [persistentní položka]")
  public Double getLocalinteresttamount() {
    return localinteresttamount;
  }

  public void setLocalinteresttamount(Double localinteresttamount) {
    this.localinteresttamount = localinteresttamount;
  }

  public Loanschedulerow divisionId(String divisionId) {
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

  public Loanschedulerow busorderId(String busorderId) {
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

  public Loanschedulerow bustransactionId(String bustransactionId) {
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

  public Loanschedulerow paydocId(String paydocId) {
    this.paydocId = paydocId;
    return this;
  }

   /**
   * předpis splátky; id objektu ostatní příjem [persistentní položka]
   * @return paydocId
  **/
  @ApiModelProperty(example = "null", value = "předpis splátky; id objektu ostatní příjem [persistentní položka]")
  public String getPaydocId() {
    return paydocId;
  }

  public void setPaydocId(String paydocId) {
    this.paydocId = paydocId;
  }

  public Loanschedulerow interestpaydocId(String interestpaydocId) {
    this.interestpaydocId = interestpaydocId;
    return this;
  }

   /**
   * zaúčtování platby; id objektu interní doklad [persistentní položka]
   * @return interestpaydocId
  **/
  @ApiModelProperty(example = "null", value = "zaúčtování platby; id objektu interní doklad [persistentní položka]")
  public String getInterestpaydocId() {
    return interestpaydocId;
  }

  public void setInterestpaydocId(String interestpaydocId) {
    this.interestpaydocId = interestpaydocId;
  }

  public Loanschedulerow interestparts(List<Loanscheduleinterestpart> interestparts) {
    this.interestparts = interestparts;
    return this;
  }

  public Loanschedulerow addInterestpartsItem(Loanscheduleinterestpart interestpartsItem) {
    this.interestparts.add(interestpartsItem);
    return this;
  }

   /**
   * předpisy úroků; kolekce bo předpis úroků [nepersistentní položka]
   * @return interestparts
  **/
  @ApiModelProperty(example = "null", value = "předpisy úroků; kolekce bo předpis úroků [nepersistentní položka]")
  public List<Loanscheduleinterestpart> getInterestparts() {
    return interestparts;
  }

  public void setInterestparts(List<Loanscheduleinterestpart> interestparts) {
    this.interestparts = interestparts;
  }

  public Loanschedulerow principalpaydocs(List<Loanscheduleprincipalpaydoc> principalpaydocs) {
    this.principalpaydocs = principalpaydocs;
    return this;
  }

  public Loanschedulerow addPrincipalpaydocsItem(Loanscheduleprincipalpaydoc principalpaydocsItem) {
    this.principalpaydocs.add(principalpaydocsItem);
    return this;
  }

   /**
   * platby jistiny; kolekce bo platby jistiny [nepersistentní položka]
   * @return principalpaydocs
  **/
  @ApiModelProperty(example = "null", value = "platby jistiny; kolekce bo platby jistiny [nepersistentní položka]")
  public List<Loanscheduleprincipalpaydoc> getPrincipalpaydocs() {
    return principalpaydocs;
  }

  public void setPrincipalpaydocs(List<Loanscheduleprincipalpaydoc> principalpaydocs) {
    this.principalpaydocs = principalpaydocs;
  }

  public Loanschedulerow principalpaydocdisplay(String principalpaydocdisplay) {
    this.principalpaydocdisplay = principalpaydocdisplay;
    return this;
  }

   /**
   * platby jistiny - popis
   * @return principalpaydocdisplay
  **/
  @ApiModelProperty(example = "null", value = "platby jistiny - popis")
  public String getPrincipalpaydocdisplay() {
    return principalpaydocdisplay;
  }

  public void setPrincipalpaydocdisplay(String principalpaydocdisplay) {
    this.principalpaydocdisplay = principalpaydocdisplay;
  }

  public Loanschedulerow paidamount(Double paidamount) {
    this.paidamount = paidamount;
    return this;
  }

   /**
   * zaplacená částka [persistentní položka]
   * @return paidamount
  **/
  @ApiModelProperty(example = "null", value = "zaplacená částka [persistentní položka]")
  public Double getPaidamount() {
    return paidamount;
  }

  public void setPaidamount(Double paidamount) {
    this.paidamount = paidamount;
  }

  public Loanschedulerow localpaidamount(Double localpaidamount) {
    this.localpaidamount = localpaidamount;
    return this;
  }

   /**
   * zaplacená částka lok. [persistentní položka]
   * @return localpaidamount
  **/
  @ApiModelProperty(example = "null", value = "zaplacená částka lok. [persistentní položka]")
  public Double getLocalpaidamount() {
    return localpaidamount;
  }

  public void setLocalpaidamount(Double localpaidamount) {
    this.localpaidamount = localpaidamount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loanschedulerow loanschedulerow = (Loanschedulerow) o;
    return Objects.equals(this.displayname, loanschedulerow.displayname) &&
        Objects.equals(this.id, loanschedulerow.id) &&
        Objects.equals(this.classid, loanschedulerow.classid) &&
        Objects.equals(this.objversion, loanschedulerow.objversion) &&
        Objects.equals(this.parentId, loanschedulerow.parentId) &&
        Objects.equals(this.posindex, loanschedulerow.posindex) &&
        Objects.equals(this.duedatedate, loanschedulerow.duedatedate) &&
        Objects.equals(this.principaltamount, loanschedulerow.principaltamount) &&
        Objects.equals(this.localprincipaltamount, loanschedulerow.localprincipaltamount) &&
        Objects.equals(this.interesttamount, loanschedulerow.interesttamount) &&
        Objects.equals(this.localinteresttamount, loanschedulerow.localinteresttamount) &&
        Objects.equals(this.divisionId, loanschedulerow.divisionId) &&
        Objects.equals(this.busorderId, loanschedulerow.busorderId) &&
        Objects.equals(this.bustransactionId, loanschedulerow.bustransactionId) &&
        Objects.equals(this.paydocId, loanschedulerow.paydocId) &&
        Objects.equals(this.interestpaydocId, loanschedulerow.interestpaydocId) &&
        Objects.equals(this.interestparts, loanschedulerow.interestparts) &&
        Objects.equals(this.principalpaydocs, loanschedulerow.principalpaydocs) &&
        Objects.equals(this.principalpaydocdisplay, loanschedulerow.principalpaydocdisplay) &&
        Objects.equals(this.paidamount, loanschedulerow.paidamount) &&
        Objects.equals(this.localpaidamount, loanschedulerow.localpaidamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, duedatedate, principaltamount, localprincipaltamount, interesttamount, localinteresttamount, divisionId, busorderId, bustransactionId, paydocId, interestpaydocId, interestparts, principalpaydocs, principalpaydocdisplay, paidamount, localpaidamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loanschedulerow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    duedatedate: ").append(toIndentedString(duedatedate)).append("\n");
    sb.append("    principaltamount: ").append(toIndentedString(principaltamount)).append("\n");
    sb.append("    localprincipaltamount: ").append(toIndentedString(localprincipaltamount)).append("\n");
    sb.append("    interesttamount: ").append(toIndentedString(interesttamount)).append("\n");
    sb.append("    localinteresttamount: ").append(toIndentedString(localinteresttamount)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    paydocId: ").append(toIndentedString(paydocId)).append("\n");
    sb.append("    interestpaydocId: ").append(toIndentedString(interestpaydocId)).append("\n");
    sb.append("    interestparts: ").append(toIndentedString(interestparts)).append("\n");
    sb.append("    principalpaydocs: ").append(toIndentedString(principalpaydocs)).append("\n");
    sb.append("    principalpaydocdisplay: ").append(toIndentedString(principalpaydocdisplay)).append("\n");
    sb.append("    paidamount: ").append(toIndentedString(paidamount)).append("\n");
    sb.append("    localpaidamount: ").append(toIndentedString(localpaidamount)).append("\n");
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

