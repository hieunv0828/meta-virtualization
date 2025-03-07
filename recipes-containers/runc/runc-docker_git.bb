include runc.inc

# Note: this rev is before the required protocol field, update when all components
#       have been updated to match.
SRCREV_runc-docker = "a9833ff391a71b30069a6c3f816db113379a4346"
SRC_URI = "git://github.com/opencontainers/runc;branch=release-1.1;name=runc-docker;protocol=https;destsuffix=${GO_SRCURI_DESTSUFFIX}  \
           file://0001-runc-Add-console-socket-dev-null.patch;patchdir=${GO_SRCURI_DESTSUFFIX} \
           file://0001-Makefile-respect-GOBUILDFLAGS-for-runc-and-remove-re.patch;patchdir=${GO_SRCURI_DESTSUFFIX} \
           file://0001-runc-docker-SIGUSR1-daemonize.patch;patchdir=${GO_SRCURI_DESTSUFFIX} \
          "

RUNC_VERSION = "1.1.12"

CVE_PRODUCT = "runc"
