package org.elm.lang.core

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.openapi.fileTypes.LanguageFileType
import org.elm.ide.icons.ElmIcons


object ElmLanguage : Language("Elm")


object ElmFileType : LanguageFileType(ElmLanguage) {

    val EXTENSION = "elm"

    override fun getIcon() =
            ElmIcons.FILE

    override fun getName() =
            "Elm file"

    override fun getDefaultExtension() =
            EXTENSION

    override fun getDescription() =
            "Elm language file"
}


class ElmFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(ElmFileType, ElmFileType.EXTENSION)
    }
}
