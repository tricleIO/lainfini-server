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
 * Plmreqroutine
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmreqroutine   {
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

  @SerializedName("workplace_id")
  private String workplaceId = null;

  @SerializedName("phase_id")
  private String phaseId = null;

  @SerializedName("parttime")
  private Double parttime = null;

  @SerializedName("setuptime")
  private Double setuptime = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("cooperation")
  private Boolean cooperation = null;

  @SerializedName("compulsoryoperation")
  private Integer compulsoryoperation = null;

  @SerializedName("finished")
  private Boolean finished = null;

  @SerializedName("salaryclass_id")
  private String salaryclassId = null;

  @SerializedName("batch")
  private Boolean batch = null;

  @SerializedName("commandlineexpr")
  private String commandlineexpr = null;

  @SerializedName("protocolfilenameexpr")
  private String protocolfilenameexpr = null;

  @SerializedName("usersmessage")
  private String usersmessage = null;

  @SerializedName("tacunit")
  private Integer tacunit = null;

  @SerializedName("tbcunit")
  private Integer tbcunit = null;

  @SerializedName("unittac")
  private Double unittac = null;

  @SerializedName("unittbc")
  private Double unittbc = null;

  @SerializedName("tac")
  private Double tac = null;

  @SerializedName("tbc")
  private Double tbc = null;

  @SerializedName("ongoing")
  private Boolean ongoing = null;

  @SerializedName("planned")
  private Boolean planned = null;

  @SerializedName("advancequantity")
  private Double advancequantity = null;

  @SerializedName("crpgrain")
  private Integer crpgrain = null;

  @SerializedName("unnormed")
  private Boolean unnormed = null;

  @SerializedName("planneddatefrom")
  private DateTime planneddatefrom = null;

  @SerializedName("plannedshifttype_id")
  private String plannedshifttypeId = null;

  @SerializedName("plannedquantity")
  private Double plannedquantity = null;

  @SerializedName("plannedunitquantity")
  private Double plannedunitquantity = null;

  @SerializedName("plannedtime")
  private Double plannedtime = null;

  @SerializedName("realizedquantity")
  private Double realizedquantity = null;

  @SerializedName("realizedunitquantity")
  private Double realizedunitquantity = null;

  @SerializedName("realizedtime")
  private Double realizedtime = null;

  @SerializedName("missedquantity")
  private Double missedquantity = null;

  @SerializedName("missedunitquantity")
  private Double missedunitquantity = null;

  @SerializedName("missedtime")
  private Double missedtime = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("realizedperc")
  private Double realizedperc = null;

  @SerializedName("realizedtimeperc")
  private Double realizedtimeperc = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("plmreqroutinespictures")
  private List<Plmreqroutinespicture> plmreqroutinespictures = new ArrayList<Plmreqroutinespicture>();

  public Plmreqroutine displayname(String displayname) {
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

  public Plmreqroutine id(String id) {
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

  public Plmreqroutine classid(String classid) {
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

  public Plmreqroutine objversion(Integer objversion) {
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

  public Plmreqroutine parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu požadavek na výrobu - vyráběná položka [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu požadavek na výrobu - vyráběná položka [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Plmreqroutine posindex(Integer posindex) {
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

  public Plmreqroutine workplaceId(String workplaceId) {
    this.workplaceId = workplaceId;
    return this;
  }

   /**
   * pracoviště; id objektu pracoviště a stroj [persistentní položka]
   * @return workplaceId
  **/
  @ApiModelProperty(example = "null", value = "pracoviště; id objektu pracoviště a stroj [persistentní položka]")
  public String getWorkplaceId() {
    return workplaceId;
  }

  public void setWorkplaceId(String workplaceId) {
    this.workplaceId = workplaceId;
  }

  public Plmreqroutine phaseId(String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

   /**
   * etapa; id objektu etapa [persistentní položka]
   * @return phaseId
  **/
  @ApiModelProperty(example = "null", value = "etapa; id objektu etapa [persistentní položka]")
  public String getPhaseId() {
    return phaseId;
  }

  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

  public Plmreqroutine parttime(Double parttime) {
    this.parttime = parttime;
    return this;
  }

   /**
   * kusový čas v minutách
   * @return parttime
  **/
  @ApiModelProperty(example = "null", value = "kusový čas v minutách")
  public Double getParttime() {
    return parttime;
  }

  public void setParttime(Double parttime) {
    this.parttime = parttime;
  }

  public Plmreqroutine setuptime(Double setuptime) {
    this.setuptime = setuptime;
    return this;
  }

   /**
   * dávkový čas v minutách
   * @return setuptime
  **/
  @ApiModelProperty(example = "null", value = "dávkový čas v minutách")
  public Double getSetuptime() {
    return setuptime;
  }

  public void setSetuptime(Double setuptime) {
    this.setuptime = setuptime;
  }

  public Plmreqroutine title(String title) {
    this.title = title;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Plmreqroutine note(String note) {
    this.note = note;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Plmreqroutine cooperation(Boolean cooperation) {
    this.cooperation = cooperation;
    return this;
  }

   /**
   * kooperace [persistentní položka]
   * @return cooperation
  **/
  @ApiModelProperty(example = "null", value = "kooperace [persistentní položka]")
  public Boolean getCooperation() {
    return cooperation;
  }

  public void setCooperation(Boolean cooperation) {
    this.cooperation = cooperation;
  }

  public Plmreqroutine compulsoryoperation(Integer compulsoryoperation) {
    this.compulsoryoperation = compulsoryoperation;
    return this;
  }

   /**
   * povinná [persistentní položka]
   * @return compulsoryoperation
  **/
  @ApiModelProperty(example = "null", value = "povinná [persistentní položka]")
  public Integer getCompulsoryoperation() {
    return compulsoryoperation;
  }

  public void setCompulsoryoperation(Integer compulsoryoperation) {
    this.compulsoryoperation = compulsoryoperation;
  }

  public Plmreqroutine finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * výrobek dokončen [persistentní položka]
   * @return finished
  **/
  @ApiModelProperty(example = "null", value = "výrobek dokončen [persistentní položka]")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public Plmreqroutine salaryclassId(String salaryclassId) {
    this.salaryclassId = salaryclassId;
    return this;
  }

   /**
   * tarif. třída; id objektu tarifní třída [persistentní položka]
   * @return salaryclassId
  **/
  @ApiModelProperty(example = "null", value = "tarif. třída; id objektu tarifní třída [persistentní položka]")
  public String getSalaryclassId() {
    return salaryclassId;
  }

  public void setSalaryclassId(String salaryclassId) {
    this.salaryclassId = salaryclassId;
  }

  public Plmreqroutine batch(Boolean batch) {
    this.batch = batch;
    return this;
  }

   /**
   * dávkově [persistentní položka]
   * @return batch
  **/
  @ApiModelProperty(example = "null", value = "dávkově [persistentní položka]")
  public Boolean getBatch() {
    return batch;
  }

  public void setBatch(Boolean batch) {
    this.batch = batch;
  }

  public Plmreqroutine commandlineexpr(String commandlineexpr) {
    this.commandlineexpr = commandlineexpr;
    return this;
  }

   /**
   * příkaz ke spuštění - výraz [persistentní položka]
   * @return commandlineexpr
  **/
  @ApiModelProperty(example = "null", value = "příkaz ke spuštění - výraz [persistentní položka]")
  public String getCommandlineexpr() {
    return commandlineexpr;
  }

  public void setCommandlineexpr(String commandlineexpr) {
    this.commandlineexpr = commandlineexpr;
  }

  public Plmreqroutine protocolfilenameexpr(String protocolfilenameexpr) {
    this.protocolfilenameexpr = protocolfilenameexpr;
    return this;
  }

   /**
   * jméno souboru s protokolem - výraz [persistentní položka]
   * @return protocolfilenameexpr
  **/
  @ApiModelProperty(example = "null", value = "jméno souboru s protokolem - výraz [persistentní položka]")
  public String getProtocolfilenameexpr() {
    return protocolfilenameexpr;
  }

  public void setProtocolfilenameexpr(String protocolfilenameexpr) {
    this.protocolfilenameexpr = protocolfilenameexpr;
  }

  public Plmreqroutine usersmessage(String usersmessage) {
    this.usersmessage = usersmessage;
    return this;
  }

   /**
   * zpráva pro uživatele [persistentní položka]
   * @return usersmessage
  **/
  @ApiModelProperty(example = "null", value = "zpráva pro uživatele [persistentní položka]")
  public String getUsersmessage() {
    return usersmessage;
  }

  public void setUsersmessage(String usersmessage) {
    this.usersmessage = usersmessage;
  }

  public Plmreqroutine tacunit(Integer tacunit) {
    this.tacunit = tacunit;
    return this;
  }

   /**
   * jednotka času pro tac [persistentní položka]
   * @return tacunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka času pro tac [persistentní položka]")
  public Integer getTacunit() {
    return tacunit;
  }

  public void setTacunit(Integer tacunit) {
    this.tacunit = tacunit;
  }

  public Plmreqroutine tbcunit(Integer tbcunit) {
    this.tbcunit = tbcunit;
    return this;
  }

   /**
   * jednotka času pro tbc [persistentní položka]
   * @return tbcunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka času pro tbc [persistentní položka]")
  public Integer getTbcunit() {
    return tbcunit;
  }

  public void setTbcunit(Integer tbcunit) {
    this.tbcunit = tbcunit;
  }

  public Plmreqroutine unittac(Double unittac) {
    this.unittac = unittac;
    return this;
  }

   /**
   * kusový čas
   * @return unittac
  **/
  @ApiModelProperty(example = "null", value = "kusový čas")
  public Double getUnittac() {
    return unittac;
  }

  public void setUnittac(Double unittac) {
    this.unittac = unittac;
  }

  public Plmreqroutine unittbc(Double unittbc) {
    this.unittbc = unittbc;
    return this;
  }

   /**
   * dávkový čas
   * @return unittbc
  **/
  @ApiModelProperty(example = "null", value = "dávkový čas")
  public Double getUnittbc() {
    return unittbc;
  }

  public void setUnittbc(Double unittbc) {
    this.unittbc = unittbc;
  }

  public Plmreqroutine tac(Double tac) {
    this.tac = tac;
    return this;
  }

   /**
   * kusový čas v sekundách [persistentní položka]
   * @return tac
  **/
  @ApiModelProperty(example = "null", value = "kusový čas v sekundách [persistentní položka]")
  public Double getTac() {
    return tac;
  }

  public void setTac(Double tac) {
    this.tac = tac;
  }

  public Plmreqroutine tbc(Double tbc) {
    this.tbc = tbc;
    return this;
  }

   /**
   * dávkový čas v sekundách [persistentní položka]
   * @return tbc
  **/
  @ApiModelProperty(example = "null", value = "dávkový čas v sekundách [persistentní položka]")
  public Double getTbc() {
    return tbc;
  }

  public void setTbc(Double tbc) {
    this.tbc = tbc;
  }

  public Plmreqroutine ongoing(Boolean ongoing) {
    this.ongoing = ongoing;
    return this;
  }

   /**
   * průběžná [persistentní položka]
   * @return ongoing
  **/
  @ApiModelProperty(example = "null", value = "průběžná [persistentní položka]")
  public Boolean getOngoing() {
    return ongoing;
  }

  public void setOngoing(Boolean ongoing) {
    this.ongoing = ongoing;
  }

  public Plmreqroutine planned(Boolean planned) {
    this.planned = planned;
    return this;
  }

   /**
   * plánovaná [persistentní položka]
   * @return planned
  **/
  @ApiModelProperty(example = "null", value = "plánovaná [persistentní položka]")
  public Boolean getPlanned() {
    return planned;
  }

  public void setPlanned(Boolean planned) {
    this.planned = planned;
  }

  public Plmreqroutine advancequantity(Double advancequantity) {
    this.advancequantity = advancequantity;
    return this;
  }

   /**
   * předstih [persistentní položka]
   * @return advancequantity
  **/
  @ApiModelProperty(example = "null", value = "předstih [persistentní položka]")
  public Double getAdvancequantity() {
    return advancequantity;
  }

  public void setAdvancequantity(Double advancequantity) {
    this.advancequantity = advancequantity;
  }

  public Plmreqroutine crpgrain(Integer crpgrain) {
    this.crpgrain = crpgrain;
    return this;
  }

   /**
   * zrnitost [persistentní položka]
   * @return crpgrain
  **/
  @ApiModelProperty(example = "null", value = "zrnitost [persistentní položka]")
  public Integer getCrpgrain() {
    return crpgrain;
  }

  public void setCrpgrain(Integer crpgrain) {
    this.crpgrain = crpgrain;
  }

  public Plmreqroutine unnormed(Boolean unnormed) {
    this.unnormed = unnormed;
    return this;
  }

   /**
   * nenormovaná operace [persistentní položka]
   * @return unnormed
  **/
  @ApiModelProperty(example = "null", value = "nenormovaná operace [persistentní položka]")
  public Boolean getUnnormed() {
    return unnormed;
  }

  public void setUnnormed(Boolean unnormed) {
    this.unnormed = unnormed;
  }

  public Plmreqroutine planneddatefrom(DateTime planneddatefrom) {
    this.planneddatefrom = planneddatefrom;
    return this;
  }

   /**
   * plánované datum
   * @return planneddatefrom
  **/
  @ApiModelProperty(example = "null", value = "plánované datum")
  public DateTime getPlanneddatefrom() {
    return planneddatefrom;
  }

  public void setPlanneddatefrom(DateTime planneddatefrom) {
    this.planneddatefrom = planneddatefrom;
  }

  public Plmreqroutine plannedshifttypeId(String plannedshifttypeId) {
    this.plannedshifttypeId = plannedshifttypeId;
    return this;
  }

   /**
   * plánovaná směna; id objektu druh pracovní směny
   * @return plannedshifttypeId
  **/
  @ApiModelProperty(example = "null", value = "plánovaná směna; id objektu druh pracovní směny")
  public String getPlannedshifttypeId() {
    return plannedshifttypeId;
  }

  public void setPlannedshifttypeId(String plannedshifttypeId) {
    this.plannedshifttypeId = plannedshifttypeId;
  }

  public Plmreqroutine plannedquantity(Double plannedquantity) {
    this.plannedquantity = plannedquantity;
    return this;
  }

   /**
   * plánované množství v ev.jedn.
   * @return plannedquantity
  **/
  @ApiModelProperty(example = "null", value = "plánované množství v ev.jedn.")
  public Double getPlannedquantity() {
    return plannedquantity;
  }

  public void setPlannedquantity(Double plannedquantity) {
    this.plannedquantity = plannedquantity;
  }

  public Plmreqroutine plannedunitquantity(Double plannedunitquantity) {
    this.plannedunitquantity = plannedunitquantity;
    return this;
  }

   /**
   * plánované množství
   * @return plannedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "plánované množství")
  public Double getPlannedunitquantity() {
    return plannedunitquantity;
  }

  public void setPlannedunitquantity(Double plannedunitquantity) {
    this.plannedunitquantity = plannedunitquantity;
  }

  public Plmreqroutine plannedtime(Double plannedtime) {
    this.plannedtime = plannedtime;
    return this;
  }

   /**
   * plánovaný čas v sekundách
   * @return plannedtime
  **/
  @ApiModelProperty(example = "null", value = "plánovaný čas v sekundách")
  public Double getPlannedtime() {
    return plannedtime;
  }

  public void setPlannedtime(Double plannedtime) {
    this.plannedtime = plannedtime;
  }

  public Plmreqroutine realizedquantity(Double realizedquantity) {
    this.realizedquantity = realizedquantity;
    return this;
  }

   /**
   * realizované množství v ev.jedn.
   * @return realizedquantity
  **/
  @ApiModelProperty(example = "null", value = "realizované množství v ev.jedn.")
  public Double getRealizedquantity() {
    return realizedquantity;
  }

  public void setRealizedquantity(Double realizedquantity) {
    this.realizedquantity = realizedquantity;
  }

  public Plmreqroutine realizedunitquantity(Double realizedunitquantity) {
    this.realizedunitquantity = realizedunitquantity;
    return this;
  }

   /**
   * realizované množství
   * @return realizedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "realizované množství")
  public Double getRealizedunitquantity() {
    return realizedunitquantity;
  }

  public void setRealizedunitquantity(Double realizedunitquantity) {
    this.realizedunitquantity = realizedunitquantity;
  }

  public Plmreqroutine realizedtime(Double realizedtime) {
    this.realizedtime = realizedtime;
    return this;
  }

   /**
   * realizovaný čas
   * @return realizedtime
  **/
  @ApiModelProperty(example = "null", value = "realizovaný čas")
  public Double getRealizedtime() {
    return realizedtime;
  }

  public void setRealizedtime(Double realizedtime) {
    this.realizedtime = realizedtime;
  }

  public Plmreqroutine missedquantity(Double missedquantity) {
    this.missedquantity = missedquantity;
    return this;
  }

   /**
   * chybějící množství v ev.jedn.
   * @return missedquantity
  **/
  @ApiModelProperty(example = "null", value = "chybějící množství v ev.jedn.")
  public Double getMissedquantity() {
    return missedquantity;
  }

  public void setMissedquantity(Double missedquantity) {
    this.missedquantity = missedquantity;
  }

  public Plmreqroutine missedunitquantity(Double missedunitquantity) {
    this.missedunitquantity = missedunitquantity;
    return this;
  }

   /**
   * chybějící množství
   * @return missedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "chybějící množství")
  public Double getMissedunitquantity() {
    return missedunitquantity;
  }

  public void setMissedunitquantity(Double missedunitquantity) {
    this.missedunitquantity = missedunitquantity;
  }

  public Plmreqroutine missedtime(Double missedtime) {
    this.missedtime = missedtime;
    return this;
  }

   /**
   * chybějící čas
   * @return missedtime
  **/
  @ApiModelProperty(example = "null", value = "chybějící čas")
  public Double getMissedtime() {
    return missedtime;
  }

  public void setMissedtime(Double missedtime) {
    this.missedtime = missedtime;
  }

  public Plmreqroutine unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah vyráběné položky
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah vyráběné položky")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Plmreqroutine realizedperc(Double realizedperc) {
    this.realizedperc = realizedperc;
    return this;
  }

   /**
   * realizováné mn. (%)
   * @return realizedperc
  **/
  @ApiModelProperty(example = "null", value = "realizováné mn. (%)")
  public Double getRealizedperc() {
    return realizedperc;
  }

  public void setRealizedperc(Double realizedperc) {
    this.realizedperc = realizedperc;
  }

  public Plmreqroutine realizedtimeperc(Double realizedtimeperc) {
    this.realizedtimeperc = realizedtimeperc;
    return this;
  }

   /**
   * realizovaný čas (%)
   * @return realizedtimeperc
  **/
  @ApiModelProperty(example = "null", value = "realizovaný čas (%)")
  public Double getRealizedtimeperc() {
    return realizedtimeperc;
  }

  public void setRealizedtimeperc(Double realizedtimeperc) {
    this.realizedtimeperc = realizedtimeperc;
  }

  public Plmreqroutine storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta tp; id objektu druh pracovní směny
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta tp; id objektu druh pracovní směny")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Plmreqroutine plmreqroutinespictures(List<Plmreqroutinespicture> plmreqroutinespictures) {
    this.plmreqroutinespictures = plmreqroutinespictures;
    return this;
  }

  public Plmreqroutine addPlmreqroutinespicturesItem(Plmreqroutinespicture plmreqroutinespicturesItem) {
    this.plmreqroutinespictures.add(plmreqroutinespicturesItem);
    return this;
  }

   /**
   * obrázky; kolekce bo požadavek - obrázek tech. postupu [nepersistentní položka]
   * @return plmreqroutinespictures
  **/
  @ApiModelProperty(example = "null", value = "obrázky; kolekce bo požadavek - obrázek tech. postupu [nepersistentní položka]")
  public List<Plmreqroutinespicture> getPlmreqroutinespictures() {
    return plmreqroutinespictures;
  }

  public void setPlmreqroutinespictures(List<Plmreqroutinespicture> plmreqroutinespictures) {
    this.plmreqroutinespictures = plmreqroutinespictures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmreqroutine plmreqroutine = (Plmreqroutine) o;
    return Objects.equals(this.displayname, plmreqroutine.displayname) &&
        Objects.equals(this.id, plmreqroutine.id) &&
        Objects.equals(this.classid, plmreqroutine.classid) &&
        Objects.equals(this.objversion, plmreqroutine.objversion) &&
        Objects.equals(this.parentId, plmreqroutine.parentId) &&
        Objects.equals(this.posindex, plmreqroutine.posindex) &&
        Objects.equals(this.workplaceId, plmreqroutine.workplaceId) &&
        Objects.equals(this.phaseId, plmreqroutine.phaseId) &&
        Objects.equals(this.parttime, plmreqroutine.parttime) &&
        Objects.equals(this.setuptime, plmreqroutine.setuptime) &&
        Objects.equals(this.title, plmreqroutine.title) &&
        Objects.equals(this.note, plmreqroutine.note) &&
        Objects.equals(this.cooperation, plmreqroutine.cooperation) &&
        Objects.equals(this.compulsoryoperation, plmreqroutine.compulsoryoperation) &&
        Objects.equals(this.finished, plmreqroutine.finished) &&
        Objects.equals(this.salaryclassId, plmreqroutine.salaryclassId) &&
        Objects.equals(this.batch, plmreqroutine.batch) &&
        Objects.equals(this.commandlineexpr, plmreqroutine.commandlineexpr) &&
        Objects.equals(this.protocolfilenameexpr, plmreqroutine.protocolfilenameexpr) &&
        Objects.equals(this.usersmessage, plmreqroutine.usersmessage) &&
        Objects.equals(this.tacunit, plmreqroutine.tacunit) &&
        Objects.equals(this.tbcunit, plmreqroutine.tbcunit) &&
        Objects.equals(this.unittac, plmreqroutine.unittac) &&
        Objects.equals(this.unittbc, plmreqroutine.unittbc) &&
        Objects.equals(this.tac, plmreqroutine.tac) &&
        Objects.equals(this.tbc, plmreqroutine.tbc) &&
        Objects.equals(this.ongoing, plmreqroutine.ongoing) &&
        Objects.equals(this.planned, plmreqroutine.planned) &&
        Objects.equals(this.advancequantity, plmreqroutine.advancequantity) &&
        Objects.equals(this.crpgrain, plmreqroutine.crpgrain) &&
        Objects.equals(this.unnormed, plmreqroutine.unnormed) &&
        Objects.equals(this.planneddatefrom, plmreqroutine.planneddatefrom) &&
        Objects.equals(this.plannedshifttypeId, plmreqroutine.plannedshifttypeId) &&
        Objects.equals(this.plannedquantity, plmreqroutine.plannedquantity) &&
        Objects.equals(this.plannedunitquantity, plmreqroutine.plannedunitquantity) &&
        Objects.equals(this.plannedtime, plmreqroutine.plannedtime) &&
        Objects.equals(this.realizedquantity, plmreqroutine.realizedquantity) &&
        Objects.equals(this.realizedunitquantity, plmreqroutine.realizedunitquantity) &&
        Objects.equals(this.realizedtime, plmreqroutine.realizedtime) &&
        Objects.equals(this.missedquantity, plmreqroutine.missedquantity) &&
        Objects.equals(this.missedunitquantity, plmreqroutine.missedunitquantity) &&
        Objects.equals(this.missedtime, plmreqroutine.missedtime) &&
        Objects.equals(this.unitrate, plmreqroutine.unitrate) &&
        Objects.equals(this.realizedperc, plmreqroutine.realizedperc) &&
        Objects.equals(this.realizedtimeperc, plmreqroutine.realizedtimeperc) &&
        Objects.equals(this.storecardId, plmreqroutine.storecardId) &&
        Objects.equals(this.plmreqroutinespictures, plmreqroutine.plmreqroutinespictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, workplaceId, phaseId, parttime, setuptime, title, note, cooperation, compulsoryoperation, finished, salaryclassId, batch, commandlineexpr, protocolfilenameexpr, usersmessage, tacunit, tbcunit, unittac, unittbc, tac, tbc, ongoing, planned, advancequantity, crpgrain, unnormed, planneddatefrom, plannedshifttypeId, plannedquantity, plannedunitquantity, plannedtime, realizedquantity, realizedunitquantity, realizedtime, missedquantity, missedunitquantity, missedtime, unitrate, realizedperc, realizedtimeperc, storecardId, plmreqroutinespictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmreqroutine {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    workplaceId: ").append(toIndentedString(workplaceId)).append("\n");
    sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
    sb.append("    parttime: ").append(toIndentedString(parttime)).append("\n");
    sb.append("    setuptime: ").append(toIndentedString(setuptime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    cooperation: ").append(toIndentedString(cooperation)).append("\n");
    sb.append("    compulsoryoperation: ").append(toIndentedString(compulsoryoperation)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    salaryclassId: ").append(toIndentedString(salaryclassId)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    commandlineexpr: ").append(toIndentedString(commandlineexpr)).append("\n");
    sb.append("    protocolfilenameexpr: ").append(toIndentedString(protocolfilenameexpr)).append("\n");
    sb.append("    usersmessage: ").append(toIndentedString(usersmessage)).append("\n");
    sb.append("    tacunit: ").append(toIndentedString(tacunit)).append("\n");
    sb.append("    tbcunit: ").append(toIndentedString(tbcunit)).append("\n");
    sb.append("    unittac: ").append(toIndentedString(unittac)).append("\n");
    sb.append("    unittbc: ").append(toIndentedString(unittbc)).append("\n");
    sb.append("    tac: ").append(toIndentedString(tac)).append("\n");
    sb.append("    tbc: ").append(toIndentedString(tbc)).append("\n");
    sb.append("    ongoing: ").append(toIndentedString(ongoing)).append("\n");
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
    sb.append("    advancequantity: ").append(toIndentedString(advancequantity)).append("\n");
    sb.append("    crpgrain: ").append(toIndentedString(crpgrain)).append("\n");
    sb.append("    unnormed: ").append(toIndentedString(unnormed)).append("\n");
    sb.append("    planneddatefrom: ").append(toIndentedString(planneddatefrom)).append("\n");
    sb.append("    plannedshifttypeId: ").append(toIndentedString(plannedshifttypeId)).append("\n");
    sb.append("    plannedquantity: ").append(toIndentedString(plannedquantity)).append("\n");
    sb.append("    plannedunitquantity: ").append(toIndentedString(plannedunitquantity)).append("\n");
    sb.append("    plannedtime: ").append(toIndentedString(plannedtime)).append("\n");
    sb.append("    realizedquantity: ").append(toIndentedString(realizedquantity)).append("\n");
    sb.append("    realizedunitquantity: ").append(toIndentedString(realizedunitquantity)).append("\n");
    sb.append("    realizedtime: ").append(toIndentedString(realizedtime)).append("\n");
    sb.append("    missedquantity: ").append(toIndentedString(missedquantity)).append("\n");
    sb.append("    missedunitquantity: ").append(toIndentedString(missedunitquantity)).append("\n");
    sb.append("    missedtime: ").append(toIndentedString(missedtime)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    realizedperc: ").append(toIndentedString(realizedperc)).append("\n");
    sb.append("    realizedtimeperc: ").append(toIndentedString(realizedtimeperc)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    plmreqroutinespictures: ").append(toIndentedString(plmreqroutinespictures)).append("\n");
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

