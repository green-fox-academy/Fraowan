table 50101 Author
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Name; Text[150])
        {
            DataClassification = ToBeClassified;
        }
        field(3; NumberOfBooksWritten; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Book where(AuthorID = field(Id)));
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }
    fieldgroups
    {
        fieldgroup(DropDown; Id, Name, NumberOfBooksWritten)
        {

        }
    }

    trigger OnInsert()
    begin

    end;

    trigger OnModify()
    begin

    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}