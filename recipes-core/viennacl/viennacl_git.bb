DESCRIPTION = "ViennaCL linear algebra library"
AUTHOR = "Ismo Puustinen <ismo.puustinen@intel.com>"
SUMMARY = "ViennaCL: OpenCL accelerated linear algebra library"
HOMEPAGE = "http://viennacl.sourceforge.net/"
LICENSE = "MIT"
PRIORITY= "optional"
SECTION = "libs"
PR = "r0"

DEPENDS = "boost beignet"

LIC_FILES_CHKSUM = "file://LICENSE;md5=02f8300a8eef6ede5cbc35fdec63f2a1"

SRCREV = "2b686633a2af2f413cbd90889a217bb9078e82a5"
SRC_URI = "git://github.com/viennacl/viennacl-dev.git"
S = "${WORKDIR}/git"

inherit cmake

# this is a headers-only recipe
RDEPENDS_${PN}-dev = ""

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"
