<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template match="/"  >
        <html>
            <body>
                <p>
                    <xsl:value-of select="count ( //auto[number(ar) > 30000])"></xsl:value-of>
                </p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
