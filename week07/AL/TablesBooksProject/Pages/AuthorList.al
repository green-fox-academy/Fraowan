page 50103 AuthorList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Author;
    CardPageId = AuthorCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;

                }
                field(NumberOfBooksWritten; Rec.NumberOfBooksWritten)
                {
                    ApplicationArea = All;
                }
            }
        }
        area(Factboxes)
        {

        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction();
                begin

                end;
            }
        }
    }
    trigger OnOpenPage()
    var
        //MyQuery: Query ExampleQuery;
        Myquery: Query AggregateQuery;
    begin
        if MyQuery.Open() then begin
            while MyQuery.Read() do begin
                Message(MyQuery.AuthorName);
            end;
            MyQuery.Close();
        end;
    end;
}