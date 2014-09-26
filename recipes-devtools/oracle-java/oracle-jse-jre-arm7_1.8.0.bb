PR = "r0"
PV_UPDATE = "06"

LIC_FILES_CHKSUM = "\
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/LICENSE;md5=98f46ab6481d87c4d77e0e91a6dbc15f \
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/COPYRIGHT;md5=971ceac73188848be9914c4d93846e7e \
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/THIRDPARTYLICENSEREADME.txt;md5=8d32d67823ec8f41743691f583f1adf5 \
	"

require oracle-jse-jre.inc

SRC_URI = "http://download.oracle.com/otn-pub/java/jdk/8u6-b23/jre-8u6-linux-arm-vfp-hflt.tar.gz"

SRC_URI[md5sum] = "a5f2a7dce850d1c0582213291c89d653"
SRC_URI[sha256sum] = "348252453db819a4cda146753b54b86ebd32191e47ff9f9be671e88aaf919d7c"
