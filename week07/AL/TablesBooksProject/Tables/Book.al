table 50100 Book
{
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, Title;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }

        field(2; Title; Text[120])
        {
            DataClassification = ToBeClassified;
        }
        field(3; HardCover; Boolean)
        {
            DataClassification = ToBeClassified;
        }

        field(4; PageCount; Integer)
        {
            DataClassification = ToBeClassified;
        }
        field(5; AuthorID; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Author;
        }
        field(6; AuthorName; Text[150])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Author.Name where(id = field(AuthorID)));
        }
        field(7; HoursToRead; Decimal)
        {
            DataClassification = ToBeClassified;
        }
        field(8; NumOfHardcoverBooks; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = Count(Book Where(HardCover = const(true)));
        }
        field(9; NumberOfBooks; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = Count(Book);
        }
        field(10; SumOfHoursToRead; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = Sum(Book.HoursToRead);
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
        fieldgroup(Dropdown; Id, Title, PageCount)
        {

        }
    }

    trigger OnInsert()
    begin
        Message('OnInsert trigger has run');
        Rec.HoursToRead := (Rec.PageCount * 2) / 60;
    end;

    trigger OnModify()
    begin
        Message('OnModify trigger has run');
        Rec.HoursToRead := (Rec.PageCount * 2) / 60;
    end;

    trigger OnDelete()
    begin
        Message('OnDelete trigger has run');
    end;

    trigger OnRename()
    begin
        Message('OnRename trigger has run');
    end;

}