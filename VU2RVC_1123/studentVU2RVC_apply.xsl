<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">


    <xsl:template match="/">
        <html>
        <body>
        <h2>Students apple-template</h2>  
        <xsl:apply-templates/>  
        </body>
        </html>
    </xsl:template>

    <xsl:template match="class/student">
        <p>
            <xsl:apply-templates select="@id"/>
            <xsl:apply-templates select="firstname"/>
            <xsl:apply-templates select="lastname"/>
            <xsl:apply-templates select="nickname"/>
            <xsl:apply-templates select="age"/>
            <xsl:apply-templates select="salary"/>
        </p>
    </xsl:template>

    <xsl:template match="@id">
        ID: <span style="color:black; font-size:32px">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>

    <xsl:template match="firstname">
        Firstname: <span style="color:green">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>

    <xsl:template match="lastname">
        Lastname: <span style="color:brown">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>

    <xsl:template match="nickname">
        Nickname: <span style="color:blue">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>

    <xsl:template match="age">
        Age: <span style="color:red">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>

    <xsl:template match="salary">
        Salary: <span style="color:orange">
    <xsl:value-of select="."/></span>
    <br />
    </xsl:template>
  
    

</xsl:stylesheet>