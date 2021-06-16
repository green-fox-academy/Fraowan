table 50100 Director
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
            trigger OnValidate()
            begin
                if StrLen(Name) < 3 then begin
                    FieldError(Name, 'You must give a name that is at least 3 characters long.');
                end;
                Name := UpperCase(Name);
            end;
        }
        field(3; DateOfBirth; Date)
        {
            DataClassification = ToBeClassified;

        }
        field(4; DomesticSalesIncome; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = sum(BoxOffice.DomesticSales where(DirectorId = field(Id)));
        }
        field(5; AverageRating; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = average(BoxOffice.Rating where(DirectorId = field(Id)));
        }
        field(6; TotalMovies; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Movie where(DirectorId = field(Id)));
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
        Validate(Name);
    end;

    trigger OnModify()
    begin
        Validate(Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}