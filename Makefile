JC=javac
BUILD_DIR=build
DIST_DIR=dist
FINAL_DIR=store
LIB_DIR=lib
SRC_DIR=src
DOC_DIR=doc
CLASS=InterfaceBDA

PROJECT=configuration-verrou

.PHONY: clean

default: clean ${FINAL_DIR}/${PROJECT}.jar

${BUILD_DIR}/${CLASS}.class: ${SRC_DIR}/${CLASS}.java
	if [ -d ${BUILD_DIR} ]; then rm -r ${BUILD_DIR}/; fi
	mkdir ${BUILD_DIR}/
	javac -d ${BUILD_DIR}/ -cp ${LIB_DIR}/* $<
	cp -r ${SRC_DIR}/icons ${BUILD_DIR}

${DIST_DIR}/test.jar: ${BUILD_DIR}/${CLASS}.class
	if [ ! -d ${DIST_DIR}/ ]; then mkdir ${DIST_DIR}; fi
	printf "Main-Class: InterfaceBDA\n" >> ${DIST_DIR}/manifest.txt
	printf "Class-Path: lib/flatlaf-2.3.jar\n" >> ${DIST_DIR}/manifest.txt
	cp -r ${LIB_DIR} ${DIST_DIR}/${LIB_DIR}
	jar cfm $@ ${DIST_DIR}/manifest.txt -C ${BUILD_DIR}/ .

${FINAL_DIR}/${PROJECT}.jar: ${BUILD_DIR}/${CLASS}.class
	if [ ! -d ${FINAL_DIR}/ ]; then mkdir ${FINAL_DIR}; fi
	cp -r ${BUILD_DIR} ${FINAL_DIR}/
	mv ${FINAL_DIR}/${BUILD_DIR} ${FINAL_DIR}/temp_dir
	unzip -q ${LIB_DIR}/flatlaf-2.3.jar -d ${FINAL_DIR}/temp_dir/ -x META-INF/MANIFEST.MF
	printf "Main-Class: InterfaceBDA\n" >> ${FINAL_DIR}/temp_dir/manifest.txt
	jar cfm $@ ${FINAL_DIR}/temp_dir/manifest.txt -C ${FINAL_DIR}/temp_dir .
	rm -r ${FINAL_DIR}/temp_dir
	chmod +x $@ # Pour pouvoir l'exécuter comme n'importe quel autre programme

doc: ${SRC_DIR}/${CLASS}.java
	javadoc src/InterfaceBDA.java\
		-locale fr_FR -private\
		-windowtitle "Documentation de l'interface de configuration"\
		-d ./doc -classpath ./lib/*

clean:
	# Ne supprimme les dossier que s'ils existent
	if [ -d ${BUILD_DIR} ]; then rm -r ${BUILD_DIR}/; fi
	if [ -d ${DIST_DIR} ]; then rm -r ${DIST_DIR}/; fi
	if [ -d ${FINAL_DIR} ]; then rm -r ${FINAL_DIR}/; fi
	if [ -d ${DOC_DIR} ]; then rm -r ${DOC_DIR}/; fi
