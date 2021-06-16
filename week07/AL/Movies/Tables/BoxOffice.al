table 50102 BoxOffice
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Rating; Decimal)
        {
            DataClassification = ToBeClassified;

        }
        field(3; DomesticSales; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if DomesticSales < 0 then begin
                    FieldError(DomesticSales, 'Yo! The sales amount cannot be negative.');
                end;
            end;

        }
        field(4; InternationalSales; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if InternationalSales < 0 then begin
                    FieldError(InternationalSales, 'Yo! The sales amount cannot be negative.');
                end;
            end;

        }
        field(5; MovieId; Integer)
        {
            TableRelation = Movie;
            DataClassification = ToBeClassified;

        }
        field(6; MovieTitle; Text[150])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.Title where(id = field(MovieId)));
        }
        field(7; DirectorId; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Movie.DirectorId where(id = field(MovieId)));
        }

    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    begin
        Validate(DomesticSales);
        Validate(InternationalSales);
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