package com.github.highcharts4gwt.generator.object.field;

import javax.annotation.CheckForNull;

import com.github.highcharts4gwt.generator.common.OutputTypeVisitor;
import com.github.highcharts4gwt.generator.option.field.AbstractFieldWriter;
import com.github.highcharts4gwt.generator.option.field.InterfaceFieldHelper;
import com.github.highcharts4gwt.generator.option.field.JsoFieldHelper;
import com.github.highcharts4gwt.generator.option.field.MockFieldHelper;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.sun.codemodel.JDefinedClass;

public class FieldArrayNumberWriter extends AbstractFieldWriter implements OutputTypeVisitor<Void, Void>
{
    public FieldArrayNumberWriter(JDefinedClass jClass, boolean pipe, String fieldName)
    {
        super(jClass, pipe, fieldName);
    }

    @Override
    @CheckForNull
    public Void visitInterface(Void in)
    {
        InterfaceFieldHelper.addGetterDeclaration(getNames(), ArrayNumber.class, getJclass());
        return null;
    }

    @Override
    @CheckForNull
    public Void visitJso(Void in)
    {
        // Same code as ArrayString
        JsoFieldHelper.writeGetterNativeCodeArrayString(getNames(), ArrayNumber.class, getJclass(), null);
        return null;
    }

    @Override
    @CheckForNull
    public Void visitMock(Void in)
    {
        MockFieldHelper.addGetterDeclaration(getNames(), ArrayNumber.class, getJclass());
        return null;
    }

    @Override
    protected String getNameExtension()
    {
        return "AsArrayNumber";
    }

}
