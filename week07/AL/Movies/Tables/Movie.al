table 50101 Movie
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; Title; Text[150])
        {
            DataClassification = ToBeClassified;

        }
        field(3; Year; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            var
                ThisYear: Integer;
            begin
                ThisYear := DATE2DMY(Today(), 3);
                if (Year < 1900) or (Year > ThisYear) then begin
                    FieldError(Year, 'The year has to be greater than 1900 and lesser than this year!');
                end;
            end;

        }
        field(4; LenghtInMinutes; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if (LenghtInMinutes < 60) then begin
                    FieldError(LenghtInMinutes, 'Yo! The movie has to be at least 60 minutes long.');
                end;
            end;

        }
        field(5; DirectorId; Integer)
        {
            TableRelation = Director;
            DataClassification = ToBeClassified;

        }
        field(6; DirectorName; Text[150])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Director.Name where(id = field(DirectorId)));
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
        Validate(Year);
        Validate(LenghtInMinutes);
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