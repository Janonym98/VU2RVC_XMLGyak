<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Student Information</h2>
                <table border="1">
                    <tr bgcolor="yellow">
                        <th>ID</th>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Nickname</th>
                        <th>Age</th>
                        <th>Salary</th>
                        <th>Grade</th>

                    </tr>
                    <xsl:for-each select="class/student">
                        <tr>
                            <td><xsl:value-of select="@id"/> </td>
                            <td><xsl:value-of select="firstname"/></td>
                            <td><xsl:value-of select="lastname"/></td>
                            <td><xsl:value-of select="nickname"/></td>
                            <td><xsl:value-of select="age"/></td>
                            <td><xsl:value-of select="salary"/></td>
                            <xsl:choose>
                                <xsl:when test="salary>'550000'">
                                    <td>
                                        <xsl:element name="fokozat">High</xsl:element>
                                    </td>
                                </xsl:when>
                                <xsl:when test="salary>'450000'">
                                    <td>
                                        <xsl:element name="fokozat">Medium</xsl:element>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td>
                                        <xsl:element name="fokozat">Low</xsl:element>
                                    </td>
                                </xsl:otherwise>
                            </xsl:choose>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>