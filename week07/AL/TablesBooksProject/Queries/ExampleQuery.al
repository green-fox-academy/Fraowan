query 50100 ExampleQuery
{
    QueryType = Normal;

    elements
    {
        dataitem(AuthorTable; Author)
        {
            column(AuthorName; Name)
            {

            }
            /*
            filter(FilterName; SourceFieldName)
            {
                
            }
            */
            dataitem(MyBook; Book)
            {
                DataItemLink = AuthorId = AuthorTable.Id;
                SqlJoinType = InnerJoin;

                column(BookTitle; Title)
                {

                }

                column(BookPageCount; PageCount)
                {

                }
            }
        }
    }


    trigger OnBeforeOpen()
    begin

    end;
}