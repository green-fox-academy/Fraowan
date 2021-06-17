codeunit 50102 EventSubscriber
{
    trigger OnRun()
    begin

    end;

    [EventSubscriber(ObjectType::Table, Database::Book, 'OnAfterInsertEvent', '', true, true)]
    local procedure WelcomeBook(var Rec: Record Book)
    begin
        Message('A new book has been added with the following title: %1', Rec.Title);
    end;
}